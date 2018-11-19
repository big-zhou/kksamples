package com.kk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "index")
public class IndexController {
	
	@RequestMapping(value = "hello")
	@ResponseBody
	public String hello() {
		return "hello";
	}
}
