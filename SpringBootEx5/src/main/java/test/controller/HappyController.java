package test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //RestAPI 전용 컨트롤러, 스프링 5버전 부터 가능
public class HappyController {

	
	@GetMapping("/happy1")
	public TestDto happy1() //Rest 전용 컨트롤러이므로 @ResponseBody 를 안써도 json으로 반환
	{
		TestDto dto = new TestDto();
		dto.setName("이미자");
		dto.setHp("016-4444-7777");
		dto.setAddr("서울시 영등포구");
		return dto;
	}
}
