package com.skcc.dtlabs.bff.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.skcc.dtlabs.bff.service.EmailService;
import com.skcc.dtlabs.bff.vo.Email;

@RestController
@RequestMapping("/v1")
public class EmailRestController {

	@Autowired
	private EmailService service;

	@RequestMapping(value = "/email", method = RequestMethod.POST)
	public String sendMail(Email email) {
		System.out.println("MainController : sendMail() : data = " + email.toString());
		return service.sendEmail(email);
	}
}
