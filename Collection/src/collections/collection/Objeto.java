package collections.collection;

import java.awt.Color;

public class Objeto {
	
	private Color color;
	private String name;
	
	public Objeto(Color color, String name) {
		this.color = color;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Objeto [color=" + color.toString() + ", name=" + name + "]";
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



}
