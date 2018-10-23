package com.skcc.dtlabs.bff.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.skcc.dtlabs.bff.vo.Email;


@Service
public class EmailService {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${api.mail.services.url}")
	private String serviceUrl;

	public String sendEmail(Email email) {
		return restTemplate.postForObject(String.format("%s/v1/email", serviceUrl), email, String.class);
	}


}
