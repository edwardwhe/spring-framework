package com.springframework.edwardwhe.processor;

import com.springframework.edwardwhe.bean.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class UserProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof User) {
			System.out.println("This is the BeanPostProcessor$postProcessorBeforeInitialization of User.class");
		}
		System.out.println("postProcessBeforeInitialization");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof User) {
			System.out.println("This is the BeanPostProcessor$postProcessAfterInitialization of User.class");
		}
		System.out.println("postProcessAfterInitialization");
		return bean;
	}
}
