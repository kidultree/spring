package board.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import board.data.BoardDao;
import board.data.BoardDto;

@Controller
public class BoardListController {

	@Autowired
	BoardDao dao;

	@GetMapping("/")
	public String home() {
		return "redirect:board/list";
	}

	@GetMapping("/board/list")
	public ModelAndView list() {
		
		ModelAndView mview = new ModelAndView();
		List<BoardDto> list = dao.getAllDatas();
		
		mview.addObject("list",list);
		mview.addObject("count",list.size());
		mview.setViewName("list");
		return mview;
	}

	@GetMapping("/board/writeform")
	public String form() {
		return "writeform";
	}

	@PostMapping("/board/insert")
	public String insert(@ModelAttribute BoardDto dto, @RequestParam MultipartFile upload, 
			HttpServletRequest request) {
//		if(!upload.isEmpty()) //사진을 안올릴 경우
//		System.out.println("파일명:"+upload.getOriginalFilename());

		// 업로드될 실제 경로
		String realPath = request.getServletContext().getRealPath("/save");
		System.out.println(realPath);
		
		// 사진을 실제 경로에 업로드 시키고 그 파일명을 dto의 photo에 저장
		// 단 사진을 안넣었을 경우 "no"라고 저장해보자
		String uploadName = changeFileName(upload.getOriginalFilename());
		if (upload.isEmpty())
			dto.setPhoto("no");
		else {
			dto.setPhoto(uploadName);
			
			// 실제 업로드
			try {
				upload.transferTo(new File(realPath+"\\"+uploadName));
			} catch (IllegalStateException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// db에 저장
		dao.insertBoard(dto);

		return "redirect:list";

	}

	// 파일명 변경하는 함수
	public String changeFileName(String fileName) {
		Date date = new Date();
		int y = date.getYear() + 1900;
		int m = date.getMonth() + 1;
		int d = date.getDate();
		int h = date.getHours();
		int mm = date.getMinutes();
		int ss = date.getSeconds();

		// ex) a.jpg 일 경우 202253161323_a.jpg
		// 초까지 받기 때문에 겹치지 않음!
		String s = "photo_"+y + m + d + h + mm + ss + "_" + fileName;
		return s;
	}
	
	//detail
	@GetMapping("/board/detail")
	public ModelAndView detail(@RequestParam Long num)
	{
		ModelAndView mview = new ModelAndView();
		//dao로 부터 dto 얻기
		BoardDto dto = dao.getData(num);
		String content = dto.getContent().replace("\n", "<br>");
		dto.setContent(content);
		//model 에 저장
		mview.addObject("dto",dto);
		mview.setViewName("detail");
		return mview;
	}
	
	//update
	@GetMapping("/board/updateform")
	public ModelAndView updateform(@RequestParam Long num)
	{
		ModelAndView mview = new ModelAndView();
		BoardDto dto=dao.getData(num);
		
		mview.addObject("dto", dto);
		mview.setViewName("updateform");
		return mview;
	}
	
	@PostMapping("/board/update")
	public String update(@ModelAttribute BoardDto dto,
			@RequestParam MultipartFile upload,
			HttpServletRequest request)
	{
		//업로드 할 폴더 실제 경로
		String path = request.getServletContext().getRealPath("/save");
		//기존 사일 파일명
		String oldFileName = dao.getData(dto.getNum()).getPhoto();
		
		if(upload.isEmpty()) {
			//사진을 업로드 안했을 경우 기존 이름으로 수정
			dto.setPhoto(oldFileName);
		}else {
			//새로 저장할 파일명
			String newFileName = changeFileName(upload.getOriginalFilename());
			//dto 에 저장
			dto.setPhoto(newFileName);
			//기존 사진 삭제
			deleteFile(path, oldFileName);
			
			//사진 업로드
			try { 
				upload.transferTo(new File(path+"\\"+newFileName));
			} catch (IllegalStateException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//db update
		dao.updateBoard(dto);
		//디테일 페이지로 이동
		return "redirect:detail?num="+dto.getNum();
	}
	
	//파일 삭제하는 메서드 (수정, 삭제시 필요하기 때문)
	public void deleteFile(String path, String oldFileName)
	{
		File file = new File(path+"\\"+oldFileName);
		if(file.exists()) //해당 경로에 파일이 있을 경우 true
		{
			file.delete();
			System.out.println("파일 삭제 성공");
		}
	}
	
	@GetMapping("/board/delete")
	public String delete(@RequestParam Long num,
			HttpServletRequest request)
	{
		String path=request.getServletContext().getRealPath("/save");
		String fileName = dao.getData(num).getPhoto();
		
		//사진 삭제
		deleteFile(path, fileName);
		dao.deleteBoard(num);
		//목록으로 이동
		return "redirect:list";
		
	}
		
}
