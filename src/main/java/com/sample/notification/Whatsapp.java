/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sample.notification;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.notify.v1.service.Binding;
import com.twilio.rest.notify.v1.Service;
import com.twilio.type.PhoneNumber;

/**
 * @author maya
 *
 */
@RestController
@RequestMapping("/api")
public class Whatsapp {

	public String ACCOUNT_SID = "ACe2adfc226cc049174d3acfd9de4ba51b";
	public String AUTH_TOKEN = "fddcb789e99b62717d1ce7cdef150dd6";



	@GetMapping("/whtsapp")
	public void testWhatsapp() {
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		Message message = Message.creator(new PhoneNumber("whatsapp:+918907097783"),
				new PhoneNumber("whatsapp:+14155238886"), "hello....kannapa..").create();

		System.out.println(message.getSid());

	}

	@GetMapping("/sms")
	public void testSMS() {

		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);


        Message message = Message
                .creator(new PhoneNumber("+9189007097783"), // to
                        new PhoneNumber("+918848278485"), // from
                        "hello kannapa?")
                .create();

		System.out.println(message.getSid());
	}

}
