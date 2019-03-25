package com.rain.controller;

import com.rain.domain.User;
import com.rain.util.common.Constants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class CommonController {
	@RequestMapping(value="/{formName}")
	 public String loginForm(@PathVariable String formName){
		// 作为一个空方法，可以匹配任何无效输入，再跳转到404
		return formName;
	}
	
	@RequestMapping(value="/")
	 public String index(){
		String blank = "index";
		return blank;
	}
	@RequestMapping(value="/welcome")
	 public String welcome(){
		String blank = "welcome";
		return blank;
	}
	@RequestMapping(value="/logout")
	public String logout(HttpSession session){
		session.removeAttribute(Constants.USER_SESSION);
		String blank = "loginForm";
		return blank;
	}
}
