package org.camcar.springtutorial.xmlconfig;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) {
		System.out.println("In after Initialization method. Bean name is "+ beanName);
		return bean;
		
	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) {
		System.out.println("In Before Initialization method. Bean name is "+ beanName);
		return bean;
	}

}
