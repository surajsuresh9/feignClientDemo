package com.feign_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feign_demo.util.FeignServiceUtil;

@RestController
@RequestMapping("/api/feign")
public class FeignController {
	@Autowired
	private FeignServiceUtil feignServiceUtil;

	@GetMapping("/name")
	public String getName() {
		return feignServiceUtil.getName();
	}

	@GetMapping("/address")
	public String getAddress() {
		return feignServiceUtil.getAddress();
	}

	@GetMapping("/status")
	public String getStatus() {
		return feignServiceUtil.getStatus();
	}

}
