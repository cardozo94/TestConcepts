package oop.patternsdesign.structural.facade.complex;

public class VideoFile {
	
	private String name;
	private String codecType;
	
	public VideoFile(String name) {
		this.name = name;
		this.codecType = name.substring(name.indexOf(".")+1);
	}

	public String getName() {
		return name;
	}

	public String getCodecType() {
		return codecType;
	}

}
