package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.service.INoticeService;
@Component
public class AppRunner implements CommandLineRunner {

	@Autowired
	private INoticeService service;
	
	@Override
	public void run(String... args) throws Exception {
		service.notificate();
		
	}

}
