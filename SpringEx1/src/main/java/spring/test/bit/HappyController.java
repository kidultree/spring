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
		list.add(new TestDto("������", "010-4537-9493", "õ��"));
		list.add(new TestDto("������", "010-1232-4433", "����"));
		list.add(new TestDto("����ȣ", "010-4455-5654", "�ƻ�"));
		list.add(new TestDto("������", "010-8726-1133", "����"));
		list.add(new TestDto("���̹�", "010-1799-9335", "����"));

		// model�� ������ ����
		mview.addObject("list", list);
		mview.addObject("today", new Date());
		// ������ �Ǵ� jsp ���ϸ� ����
		mview.setViewName("list2");
		return mview;
	}

}