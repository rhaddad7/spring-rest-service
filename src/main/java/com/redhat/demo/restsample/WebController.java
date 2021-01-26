package com.redhat.demo.restsample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Value;

@RestController
public class WebController {

        @Value("${app.version}")
        private String appVersion;  

        @Value("${app.name}")
        private String appName;

	@RequestMapping("/")
	public RestResponse Version()
	{
		RestResponse response = new RestResponse();
		response.setVersion(appVersion);
		response.setAppName(appName);
		return response;
	}
}
