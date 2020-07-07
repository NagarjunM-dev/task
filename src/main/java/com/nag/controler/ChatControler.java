package com.nag.controler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/chatbook-application")
public class ChatControler {
	@Value("${server.port}")
	private String port;

	@GetMapping("/chat")
	public String chatNow() {
		return "application is up on port : " + port;
	}

	@GetMapping("/")
	public String refresh() {
		return "";
	}

}
