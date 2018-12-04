package com.cshikami.model;

public abstract class Olive {
	
	//constants
//	public static final String KALAMATA = "Kalamata";
//	public static final String LIGURIAN = "Ligurian";
	
	private OliveName name = OliveName.KALAMATA;
//	private String name = KALAMATA;
	private OliveColor color = OliveColor.PURPLE;
//	private long color;
	private int oil;
	
//	public Olive() {
//		
//	}
	
	public Olive(OliveName name, OliveColor color, int oil) {
		this.name = name;
		this.color = color;
		this.oil = oil;
	}
	
	public OliveName getName() {
		return name;
	}
	public void setName(OliveName name) {
		this.name = name;
	}
	public OliveColor getColor() {
		return color;
	}
	public void setColor(OliveColor color) {
		this.color = color;
	}
	public int getOil() {
		String msg = name + ", from " + getOrigin() + ": " + oil + " units";
		System.out.println(msg);
		return oil;
	}
	public void setOil(int oil) {
		this.oil = oil;
	}
	
	public abstract String getOrigin();
	
	public String toString() {
		return name.toString();
	}
}
