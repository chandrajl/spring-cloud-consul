package com.cloud.consul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableConfigurationProperties(value=MyConfig.class)
public class SpringCloudConsulApplication {

	@Autowired
	private MyConfig config;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsulApplication.class, args);
	}
	
	@RequestMapping(value="/myconfigdata", method=RequestMethod.GET)
	public MyConfig getConfiguration() {
		
		return config;
	}

}

