package com.cshikami;

import java.util.ArrayList;
import java.util.List;

import com.cshikami.model.Kalamata;
import com.cshikami.model.Ligurian;
import com.cshikami.model.Olive;
import com.cshikami.model.OliveColor;
import com.cshikami.model.OliveName;

public class Main {

	//olives created and given values in the main method
	public static void main(String[] args) {
		//create an ArrayList of olives of type Olive
		List<Olive> olives = new ArrayList<>();
		
		//instantiate three olives and set values
		//Olive olive2 = new Olive(OliveName.KALAMATA, OliveColor.PURPLE, 3);
		
		olives.add(new Kalamata());
		olives.add(new Kalamata());
		olives.add(new Ligurian());
		olives.add(new Ligurian());
		olives.add(new Ligurian());
		olives.add(new Ligurian());
		//Olive olive3 = new Olive(OliveName.LIGURIAN, OliveColor.BLACK, 5);
		
		//set the size of the olive
//		olive2.setOil(1);
//		olive3.setOil(4);
		
		//add the olives to the olives ArrayList
//		olives.add(new Olive(OliveName.KALAMATA, OliveColor.PURPLE, 3)); //one way of adding a new Olive to the ArrayList
		
		//olives.add(olive2); //another way is to instantiate olive first to Olive variable and then add that to the ArrayList
		//olives.add(olive3);
//		olives.add(new Olive(OliveName.LIGURIAN, OliveColor.BLACK, 5));
//		olives.add(new Olive(OliveName.LIGURIAN, OliveColor.BLACK, 5));
//		olives.add(new Olive(OliveName.LIGURIAN, OliveColor.BLACK, 5));
		
		//instantiate an OlivePress
		Press press = new OlivePress();
		press.setOil(5);
		//perform the instance method getOil and store the result in totalOil variable
		int totalOil = press.getOil(olives);
		//print to console totalOil
		System.out.println("Total olive oil: " + totalOil);
		
		//when instantiating an interface directly, you implement all of its abstract methods yourself
//		Press p2 = new Press() {
//
//			@Override
//			public int getOil(List<Olive> olives) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//
//			@Override
//			public void setOil(int oil) {
//				// TODO Auto-generated method stub
//				
//			}
//		
//	};

}
}
