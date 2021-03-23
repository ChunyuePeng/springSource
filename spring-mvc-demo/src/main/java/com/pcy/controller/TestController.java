package com.pcy.controller;

import com.pcy.entity.MyBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController {

	@RequestMapping("sayHello")
	@ResponseBody
	public ModelAndView sayHello(HttpServletRequest request, int age, String name) {
		String myData = (String) request.getServletContext().getAttribute("myData");
		System.out.println("myData->" + myData);
		ModelAndView mav = new ModelAndView();
		MyBean bean = new MyBean(age, name);
		mav.addObject("myBean", bean);
		mav.setViewName("sayHello");
		return mav;
	}
}