package com.app.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class DemoBeanFactoryPostProcessor implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0) throws BeansException {
		
		BeanDefinition bd = arg0.getBeanDefinition("restaurantBean");
		
		MutablePropertyValues mpv = bd.getPropertyValues();
		
		mpv.addPropertyValue("note","hi this is edited welcome note");
	}

}
