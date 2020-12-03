package week4assignment.org.system;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TrimInArraylist {

	public static void main(String[] args) {
		String[] input= {"red","green","brown","black","white","orange","****","*****"};
		
		ArrayList<String> valuesarraylist=new ArrayList<String>();
		valuesarraylist.add("red");
		valuesarraylist.add("ytry");
		valuesarraylist.add("trytry");
		
		//checking the arraylist is empty or not
		
		if(valuesarraylist.isEmpty()) {
			System.out.println("The list is empty");
			System.out.println(valuesarraylist.size());}
		else {
			valuesarraylist.removeAll(valuesarraylist);
			
			System.out.println(valuesarraylist.size());
			
			 
		}}}


