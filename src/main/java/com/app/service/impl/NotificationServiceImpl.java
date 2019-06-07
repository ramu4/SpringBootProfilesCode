package com.app.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.service.INoticeService;
@Component
@Profile("default")
public class NotificationServiceImpl implements INoticeService {

	@Override
	public void notificate() {
		System.out.println("from default");
	}

}
