package com.feign_demo.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "feignDemo", url = "http://localhost:8084/api/dummy")
public interface FeignServiceUtil {

	@GetMapping("/name")
	String getName();

	@GetMapping("/address")
	public String getAddress();

	@GetMapping("/status")
	public String getStatus();
}
