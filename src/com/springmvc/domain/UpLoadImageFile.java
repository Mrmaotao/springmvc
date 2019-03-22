package com.springmvc.domain;

import org.springframework.web.multipart.MultipartFile;

public class UpLoadImageFile {
	MultipartFile image;

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}
	
}
