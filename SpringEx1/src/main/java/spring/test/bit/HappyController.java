package spring.test.bit;

import java.util.Date;
import java.util.List;
import java.util.Vector;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/board")
public class HappyController {

	@RequestMapping("/list")
	public ModelAndView list1() {

		ModelAndView mview = new ModelAndView();

		List<TestDto> list = new Vector<TestDto>();
		list.add(new TestDto("정종석", "010-4537-9493", "천안"));
		list.add(new TestDto("김정하", "010-1232-4433", "서울"));
		list.add(new TestDto("강경호", "010-4455-5654", "아산"));
		list.add(new TestDto("도지태", "010-8726-1133", "공주"));
		list.add(new TestDto("김이박", "010-1799-9335", "대전"));

		// model에 데이터 저장
		mview.addObject("list", list);
		mview.addObject("today", new Date());
		// 포워드 되는 jsp 파일명 지정
		mview.setViewName("list2");
		return mview;
	}

}
