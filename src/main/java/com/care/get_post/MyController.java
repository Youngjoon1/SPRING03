package com.care.get_post;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/my")
public class MyController {
	public MyController() {
		System.out.println("controller");
	}
	
	@RequestMapping("index")
	public String index() {
		
		return "get_post/index";
	}
	// 속성이 2개 들어갈 경우 value로 지정
	@RequestMapping(value ="result", method =RequestMethod.GET)
	public String result(HttpServletRequest req,Model model) { 
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));//받아오는 형식은 String
		
		System.out.println("전송 박식 : " + req.getMethod());
		System.out.println("name : "  + name);
		System.out.println("age : " + age);
		
		model.addAttribute("name",name);
		model.addAttribute("age",age);
		model.addAttribute("method",req.getMethod());
		
		return "get_post/result";
	}
	
	@PostMapping("result")
	public String resultPost(@RequestParam String name,@RequestParam("age") int a,HttpServletRequest req,Model model) { 
		//넘어오는 변수와 지정변수가 이름이 같으면 생략 가능 ,다른이름을 지정하고 싶으면 지정 
		
		model.addAttribute("name",name);
		model.addAttribute("age",a);
		model.addAttribute("method",req.getMethod());
		
		return "get_post/result";
	}
	
	@PostMapping("dto")
	public String dto(MyDTO dto,Model model) {
		System.out.println(dto.getName());
		System.out.println(dto.getAge());
		System.out.println(dto.getAddr());
		
		model.addAttribute("dto",dto);
		return "get_post/dto";
	}
	
	
	
}
