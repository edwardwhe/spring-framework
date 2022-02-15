package com.springframework.edwardwhe;

import com.springframework.edwardwhe.bean.User;
import com.springframework.edwardwhe.config.AppConfig;
import com.springframework.edwardwhe.processor.UserProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Set;

/**
 * @author heyujia
 */
public class SpringApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(AppConfig.class);
		applicationContext.registerBean("UserProcessor", UserProcessor.class);
		applicationContext.refresh();
		User user = applicationContext.getBean(User.class);
		String output1 = "user";
		String output3 = "";
		StringBuilder stringBuilder = new StringBuilder();
		String output = stringBuilder.append(output1).append(output3).toString();
		Set<String> a;
		System.out.println(output);
		System.out.println("user");
		System.out.println(output3);
	}
}
