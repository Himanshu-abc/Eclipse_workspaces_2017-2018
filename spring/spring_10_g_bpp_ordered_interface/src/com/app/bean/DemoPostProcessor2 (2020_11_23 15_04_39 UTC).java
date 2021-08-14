package com.app.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class DemoPostProcessor2 implements BeanPostProcessor,Ordered {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("DemoPostProcessor2 : processing bean after initailaization and after init-life cycle method of bean "+beanName);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("DemoPostProcessor2 : processing bean after initialization and before init-life cycle of bean "+beanName);	
	return bean;
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
