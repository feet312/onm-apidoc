package com.sk.signet.onm.apidoc.endpoint;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/system")
@RequiredArgsConstructor
public class SystemEndpoint {
	
	@Value(value = "${spring.application.name")
	String appName;
	
	public String getSystemHealth() {
		return "["+ appName +"] Service is Healthy";
	}

}
