package org.camcar.springtutorial.annotations;

import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
//@Controller
public class Circle implements Shape, ApplicationEventPublisherAware {

	private Point center;
	// messages from property file
	@Autowired
	private MessageSource messageSource;
	//to publish events
	private ApplicationEventPublisher publisher;

	public Point getCenter() {
		return center;
	}

	// @Required
	// @Autowired
	// @Qualifier("circleRelated")
	@Resource(name = "pointC")
	public void setCenter(Point center) {
		this.center = center;
	}

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	@PostConstruct
	public void initializeCircle() {
		System.out.println("Init of circle");
	}

	@PreDestroy
	public void destroyCircle() {
		System.out.println("Destroy of circle");
	}

	@Override
	public void draw() {
		System.out.println(getMessageSource().getMessage("circle",
				new Object[] { getCenter().getX(), getCenter().getY() }, "Default Circle", null));
		publisher.publishEvent(new DrawEvent(this));
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
		
	}
}
