package com.sample.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@SpringBootApplication
public class NotificationApplication {

	public static final String ACCOUNT_SID = "ACe2adfc226cc049174d3acfd9de4ba51b";
	public static final String AUTH_TOKEN = "fddcb789e99b62717d1ce7cdef150dd6";

	
	public static void main(String[] args) {
		SpringApplication.run(NotificationApplication.class, args);
		
	}

}
