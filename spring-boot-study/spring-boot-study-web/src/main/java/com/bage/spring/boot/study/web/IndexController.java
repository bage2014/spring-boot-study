package com.bage.spring.boot.study.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

	
	@RequestMapping("/home")
	public String index(HttpServletRequest request, HttpServletResponse response) {
		logger.debug("IndexController.index() is work"); 
		return "index";
		
	}
	
	
}
