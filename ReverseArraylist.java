package week4assignment.org.system;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArraylist {

	public static void main(String[] args) {
		ArrayList<String> valuesarraylist=new ArrayList<String>();
		valuesarraylist.add("red");
		valuesarraylist.add("ytry");
		valuesarraylist.add("trytry");
		
		//To reverse elements in an arraylist
		
		Collections.reverse(valuesarraylist);
		System.out.println(valuesarraylist);

	}

}
