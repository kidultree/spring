package data.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import data.mapper.MemberMapperInter;

@Controller
@RequestMapping("/login") //공통 매핑
public class LoginController {

   @Autowired
   MemberMapperInter mapper;
   
   @GetMapping("/form")
   public String form()
   {
      return "/sub2/login/loginform";
   }
   
   @PostMapping("/process")
   public String loginProcess(
         @RequestParam String id,
         @RequestParam String pass,
         @RequestParam(required = false) String chkid,
         HttpSession session)
   {
      System.out.println("chkid:"+chkid); //null or on
      //로그인 성공여부
      Map<String, String> map = new HashMap<>();
      map.put("id", id); //sql 과 같아야함
      map.put("pass", pass);
      int n=mapper.login(map);
      if(n==1) {
         //세션 유지 시간을 지정(기본은 30분)
         session.setMaxInactiveInterval(60*60*6);//유지시간 6시간
         //아이디와 비번이 맞는 경우  각종 정보를 세션에 저장
         session.setAttribute("loginid", id);
         //로그인한 사람의 이름
         String name=mapper.getSearchName(id);
         session.setAttribute("loginname", name);
         session.setAttribute("saveid",chkid==null?"no":"yes");
         session.setAttribute("loginok", "yes");
         return "redirect:../"; // 성공 후 메인페이지로 이동
      }else {
         //아이디와 비번이 틀린경우 다시 로그인 폼으로
         return "redirect:form";
        
      }
      
   }
   @GetMapping("/logout")
   @ResponseBody
   public void logout(HttpSession session) {
      //세션에서 loginok삭제
      session.removeAttribute("loginok");
   }
}