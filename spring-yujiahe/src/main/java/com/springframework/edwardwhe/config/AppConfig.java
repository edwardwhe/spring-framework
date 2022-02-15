package com.springframework.edwardwhe.config;

import com.springframework.edwardwhe.bean.User;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

	@Bean(initMethod = "init")
	public User User() {
		return new User("gaggi", "1");
	}
}
