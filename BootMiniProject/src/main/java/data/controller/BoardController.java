package data.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import Util.FileUtil;
import data.dto.BoardDto;
import data.mapper.AnswerMapperInter;
import data.mapper.MemberMapperInter;
import data.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardService service;
	
	@Autowired
	private AnswerMapperInter answerMapper;

	@Autowired
	private MemberMapperInter memberMapper;
	
	@GetMapping("/list")
	public ModelAndView list(
			@RequestParam(defaultValue= "1") int currentPage
			)
	{
		ModelAndView mview = new ModelAndView();
		//페이징 처리
		int totalCount; //총 갯수
		int perPage=5; //한 페이지당 보여질 글의 갯수
		int perBlock=5; //한 블럭당 보여질 글의 갯수 (◀이전 1,2,3,4,5 다음▶)
		int totalPage; //총 페이지수
		int startNum; //한 페이지에서 보여질 시작 글번호
		int startPage; //한 블럭에서 보여질 시작 페이지 번호
		int endPage; //한 블럭에서 보여질 끝 페이지 번호
		int no; //각 페이지당 보여질 시작번호
		
		//총 글의 갯수를 구한다
		totalCount = service.getTotalCount();
		//총 페이지 수를 구한다
		totalPage = totalCount/perPage+(totalCount%perPage==0?0:1);
		//totalCount를 perPage로 나눈게 나머지 없으면 0이고 있으면 1 더하라.
		
//		방법2) totalPage = (int)Math.ceil((double)totalCount/perPage); //무조건 올림
		
		//각 블럭의 시작 페이지 (한 블럭당 5개씩 보여줌)
		//1,6,11 ... (currentPage 가 1~5 일때는 1, 6~10일때는 6)
		startPage = (currentPage-1)/perBlock*perBlock+1;
		// 0/0*0+1 -> 1 
		
		//5,10,15... (currentPage 가 1~5 일때는 1, 6~10일때는 10)
		endPage = startPage+perBlock-1;
		
		//문제점 (마지막 블럭은 총 페이지수까지만 나와야함) 
		//ex) 글이 12개밖에 없다면 11~15 페이지.. 블럭 12이까지만 나와야지!
		if(endPage>totalPage) {
			endPage=totalPage;
		}
		//각 페이지에서 보여질 글의 시작번호 (mysql은 0부터)
		//ex) 한 페이지당 3개일 경우 1페이지 : 0, 2페이지: 3, 3페이지: 6
		startNum = (currentPage-1)*perPage;
		
		//각 페이지당 보여질 시작번호
		no = totalCount-(currentPage-1)*perPage;
		
		//데이터 가져오기
		List<BoardDto> list = service.getList(startNum, perPage);
		//각 데이터에 id를 이용해서 이름 넣어주기
		for(BoardDto dto:list)
		{
			String id = dto.getId();
			String name = memberMapper.getSearchName(id);
			dto.setName(name);
			//댓글 갯수 acount에 넣기
			int acount = answerMapper.getAnswerList(dto.getNum()).size();
			dto.setAcount(acount);
		}
		
		mview.addObject("currentPage",currentPage);
		mview.addObject("totalCount",totalCount);
		mview.addObject("totalPage",totalPage);
		mview.addObject("startPage",startPage);
		mview.addObject("endPage",endPage);
		mview.addObject("no",no);
		mview.addObject("list",list);

		mview.setViewName("/board/boardlist");
		return mview;
	}
	
	@GetMapping("/form")
	   public ModelAndView form(@RequestParam Map<String, String>map) {
	      ModelAndView mview = new ModelAndView();
	      //답글일 경우 읽어야 할 5개의 값 (새 글일 경우는 값이 안넘어옴 = 모두 null)
	      String currentPage=map.get("currentPage");
	      String num=map.get("num");
	      String reg=map.get("reg");
	      String restep=map.get("restep");
	      String relevel=map.get("relevel");
	      
	      mview.addObject("currentPage",currentPage==null?"1":currentPage);
	      mview.addObject("num",num==null?"0":num);
	      mview.addObject("reg",reg==null?"0":reg);
	      mview.addObject("restep",restep==null?"0":restep);
	      mview.addObject("relevel",relevel==null?"0":relevel);
	      
	  	  mview.setViewName("/board/boardform");
	      return mview;
	   }
	
		@PostMapping("/insert") //dto가 읽음
		public String insert(
			@ModelAttribute BoardDto dto,
			@RequestParam String currentPage,
			@RequestParam ArrayList<MultipartFile> upload,
			HttpSession session,
			HttpServletRequest request
			) 
		{	//사진을 저장할 경우
			String path = request.getServletContext().getRealPath("/save");
			//세션으로부터 로그인한 아이디 얻기
			String loginid = (String)session.getAttribute("loginid");
			dto.setId(loginid); //dto에 id 넣기
			
			//사진을 업로드 안했을 경우 photos 에 'no'라고 저장
			if(upload.get(0).getOriginalFilename().equals("")) {
				dto.setPhotos("no");
			}else {
				FileUtil fileUtil = new FileUtil();
				String photos = "";
				for(MultipartFile f:upload)
				{
					String rename = fileUtil.changeFileName(f.getOriginalFilename());
					photos+=rename+",";
					
					File file = new File(path+"\\"+rename);
					try {
						f.transferTo(file); //save 폴더에 업로드됨
					} catch (IllegalStateException | IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				//마지막 컴마 제거
				photos = photos.substring(0,photos.length()-1);
				System.out.println(photos);
				dto.setPhotos(photos);
			}
			
			//db insert
			service.insertBoard(dto);
			
			return "redirect:list?currentPage="+currentPage; //해당 페이지로 이동
		}
		
		@GetMapping("/content")
		public ModelAndView content(
				@RequestParam int num,
				@RequestParam String currentPage
				)
		
		{
			ModelAndView mview = new ModelAndView();
			//조회수 1 증가
			service.updateReadCount(num);
			//num에 해당하는 dto
			BoardDto dto = service.getData(num);
			//이름 넣어주기
			String name = memberMapper.getSearchName(dto.getId());
			dto.setName(name); 
			
			
			mview.addObject("dto", dto);
			mview.addObject("currentPage", currentPage);
			
			mview.setViewName("/board/content");
			return mview;
		}
		
		@GetMapping("/chu")
		@ResponseBody
		public Map<String, Integer> updateChu(
			@RequestParam int num,
			@RequestParam int chu
			)
		
		{
			//db chu, totalchu update
			service.updateChu(chu, num);
			
			//변경된 totalchu 받아오기
			int totalchu = service.getData(num).getTotalchu();
			
			Map<String, Integer> map = new HashMap<>();
			map.put("totalchu", totalchu);
			return map;
		}
		
		@GetMapping("/updateform")
		public ModelAndView updateForm(
				
				@RequestParam int num,
				@RequestParam int currentPage
				) {
			
			ModelAndView mview = new ModelAndView();
			//num에 해당하는 dto
			BoardDto dto = service.getData(num);
			//model에 저장
			mview.addObject("dto",dto);
			mview.addObject("currentPage",currentPage);
			
			mview.setViewName("/sub2/board/updateform");
			return mview;
		}
		
		@PostMapping("/update")
		public String update(
			@ModelAttribute BoardDto dto,
			@RequestParam String currentPage,
			@RequestParam ArrayList<MultipartFile> upload,
			HttpServletRequest request
			) 
		{	//사진을 저장할 경우
			String path = request.getServletContext().getRealPath("/save");
			
			//사진을 업로드 안했을 경우 photos 에 'null'이라고 저장
			if(upload.get(0).getOriginalFilename().equals("")) {
				dto.setPhotos(null);
			}else {
				FileUtil fileUtil = new FileUtil();
				String photos = "";
				for(MultipartFile f:upload)
				{
					String rename = fileUtil.changeFileName(f.getOriginalFilename());
					photos+=rename+",";
					
					File file = new File(path+"\\"+rename);
					try {
						f.transferTo(file); //save 폴더에 업로드됨
					} catch (IllegalStateException | IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				//마지막 컴마 제거
				photos = photos.substring(0,photos.length()-1);
				//System.out.println(photos);
				dto.setPhotos(photos);
			}
			
			//db update
			service.updateBoard(dto);
			//내용보기로 이동한다
			return "redirect:content?currentPage="+currentPage+"&num="+dto.getNum(); //해당 페이지로 이동
		}
		
		@GetMapping("/delete")
		public String delete(
				@RequestParam int num,
				@RequestParam int currentPage,
				HttpServletRequest request
				)
		{	//save 폴더의 위치 구하기
			String path = request.getServletContext().getRealPath("/save"); //save의 실제 경로
			//일단 save 폴더의 파일 삭제
			String photos = service.getData(num).getPhotos();
			if(!photos.equals("no")) {
				String []fileName=photos.split(",");
				for(String f:fileName) {
					File file = new File(path+"\\"+f);
					if(file.exists())
						file.delete();
				}
			}
			
			//db에서 데이터 삭제
			service.deleteBoard(num);
			//보던 페이지로 이동
			return "redirect:list?currentPage="+currentPage;
		}		
}


