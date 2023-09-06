package com.care.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController02 {

	@GetMapping("form")
	public String form() {
		
		return "login/form";
	}
	
	@PostMapping("login_chk")
	public String login_chk(@RequestParam String id,@RequestParam String pwd,HttpSession session) {
		//HttpSession 세션명
		String DBId="1", DBPwd="1", nick="홍길동";
		if(id.equals(DBId) && pwd.equals(DBPwd)) {
			session.setAttribute("id", DBId);
			session.setAttribute("nick", nick);
			return "redirect:main";
		}
		
		return "redirect:form";
	}
	
	@GetMapping("main")
	public String main(Model model) {
		model.addAttribute("id","abcde"); //session보단 model이 우선순위 model의 범위는 request랑 같다
		return "login/main";
	}
	
	@GetMapping("logout")
	public String logout(HttpSession se01,HttpServletRequest req) {
		//세션을 얻어오는 여러가지 방식
		HttpSession se02 = req.getSession(); 
		System.out.println("se01" + se01.getAttribute("nick"));
		System.out.println("se02" + se02.getAttribute("nick"));
		
		se02.invalidate(); //세션만료
		
		return "redirect:form";
	}
	
	
	
	
	
	
}
