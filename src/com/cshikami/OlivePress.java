package com.cshikami;

import java.util.List;

import com.cshikami.model.Olive;

//processes the oil
public class OlivePress implements Press {
	
	private int currentOil;
	
	public int getOil(List<Olive> olives) {
		
		int totalOil = currentOil;
		
		for(Olive o : olives) {
			//System.out.println(o.getName());
			totalOil += o.getOil();
		}
		
		return totalOil;
		
	}

	@Override
	public void setOil(int oil) {
		currentOil = oil;
	}
}
