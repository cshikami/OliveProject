package com.cshikami.model;

public enum OliveColor {
	
	PURPLE("Purple", 0x2E0054), BLACK("Black", 0x000000), GREEN("Green", 0x00FF00);
	
	String name;
	long color;
	
	OliveColor(String name, long color) {
		this.name = name;
		this.color = color;
	}
	
	public String toString() {
		return name;
	}

}
