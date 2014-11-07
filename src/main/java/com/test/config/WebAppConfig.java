package com.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@EnableLoadTimeWeaving
@ComponentScan("com.test.*")
public class WebAppConfig {
	static {
		int onlyForBreakPoint = 1;
		onlyForBreakPoint += onlyForBreakPoint;
	}
}
