package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hab2")
public class HelloController2 {

	@GetMapping
	public String hello() {
		return "Conseguir me manter focada e aprender mais o conteúdo";
	}

}
