package oop.patternsdesign.behavioral.command.receiver;

public class Stereo {
	
	public void on() {
		System.out.println("Stereo is on");
	}
	
	public void off() {
		System.out.println("Stereo is off");
	}
	
	public void sertCD() {
		System.out.println("Stereo is set for CD input");
	}
	
	public void setDVD() {
		System.out.println("Stereo is set for DVD input");
	}
	
	public void setRadio() {
		System.out.println("Stereo is set for Radio");
	}
	
	public void setVolume(int volume) {
		System.out.println("Stero volumen set to "+volume);
	}

}
