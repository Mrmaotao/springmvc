package com.springmvc.controller;

import java.io.File;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.xwork.RandomStringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.domain.UpLoadImageFile;
@Controller
public class UpLoadImageController {
	@RequestMapping("/uploadImage")
	public ModelAndView upload(HttpServletRequest request,UpLoadImageFile file) throws Exception{
		//给上传的图片重新命名
		String name = RandomStringUtils.randomAlphanumeric(10);
		String newFilename = name+".jpg";
		//获取上传文件的路径
		
		File newFile = new File(request.getServletContext().getRealPath("/image"),newFilename);
		newFile.getParentFile().mkdirs();
		file.getImage().transferTo(newFile);
		System.out.println(file.getImage());
		ModelAndView mav = new ModelAndView("image");
        mav.addObject("imageName", newFilename);
		return mav;
		 
	}
}
