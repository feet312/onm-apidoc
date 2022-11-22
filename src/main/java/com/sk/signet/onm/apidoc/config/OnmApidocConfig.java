package com.sk.signet.onm.apidoc.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.sk.signet.onm.apidoc.dto.ServiceTarget;

@Component
@ConfigurationProperties("services")
public class OnmApidocConfig {

	private List<ServiceTarget> ServiceTarget = new ArrayList<>();
	
	public List<ServiceTarget> getTarget() {
		return ServiceTarget;
	}
}
