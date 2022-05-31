package oop.patternsdesign.structural.proxy.service;

public class ProxyImage implements Image {
	
	private RealImage realImage;
	private String fileName;
	
	public ProxyImage(String fielName) {
		this.fileName = fielName;
	}

	@Override
	public void display() {
		if(realImage == null) 
			realImage = new RealImage(fileName);
		realImage.display();		
	}

}
