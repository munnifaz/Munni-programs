package week4.day2;

import java.util.ArrayList;
import java.util.List;

public class Assignment1_Arraylist {

	public static void main(String[] args) {
		
		//String[] input= {"red","green","brown","black","white","orange"};
		
		List<String> valuesarraylist=new ArrayList<String>();
		valuesarraylist.add("red");
		valuesarraylist.add("green");
		valuesarraylist.add("Blue");
		valuesarraylist.add("Brown");
		valuesarraylist.add("yellow");
		
		System.out.println(valuesarraylist);
		
		for (String iterate : valuesarraylist) {
			//System.out.println(iterate);
			}
			
			valuesarraylist.add(0, "munni");
			System.out.println(valuesarraylist);
			
			valuesarraylist.add(valuesarraylist.size()-1, "Fazil");
			System.out.println(valuesarraylist);
			
			System.out.println(valuesarraylist.get(0));
			System.out.println(valuesarraylist.get(4));
			
			
			
			
			
			
	}

}
