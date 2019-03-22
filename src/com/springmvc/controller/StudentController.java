package com.springmvc.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.domain.Student;
 
@Controller
public class StudentController {
	@RequestMapping("/add1")
	public String Add(Student student){
		System.out.println("name:"+student.getName());
		System.out.println("age:"+student.getAge());
		return "index";
		
	}
    @RequestMapping(value="/index")
    public ModelAndView handleRequest( HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("message", "Hello Spring MVC");
//        mav.addObject("name", request.getParameter("name"));
//        mav.addObject("age", request.getParameter("age"));
        return mav;
    }
    @RequestMapping("/jump")
    
    public ModelAndView jump(HttpSession session){
    	//判断是不是第一次访问
    	Integer i = (Integer) session.getAttribute("count1");
    	String a = session.getId();
    	Integer b = session.getMaxInactiveInterval();
    	if(i==null)
    		i=0;
    	i++;
    	session.setAttribute("count1", i);
    	session.setAttribute("sessionid", a);
    	session.setAttribute("time", b);
    	ModelAndView modelAndView = new ModelAndView("redirect:/index");
    	return modelAndView;
    }
    
}
