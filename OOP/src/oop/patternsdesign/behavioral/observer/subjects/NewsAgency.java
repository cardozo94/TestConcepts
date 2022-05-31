package oop.patternsdesign.behavioral.observer.subjects;

import java.util.ArrayList;
import java.util.List;

import oop.patternsdesign.behavioral.observer.observers.Channel;

public class NewsAgency {
	
	private String news;
	private List<Channel> channels = new ArrayList<Channel>();
	
	public void addObserver(Channel channel) {
		this.channels.add(channel);
	}
	
	public void removeObserver(Channel channel) {
		this.channels.remove(channel);
	}
	
	public void setNews(String news) {
		this.news = news;
		for (Channel channel : channels) {
			channel.update(this.news);
		}
	}

}
