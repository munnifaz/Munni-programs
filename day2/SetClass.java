package week4.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetClass {

	public static void main(String[] args) {
		
		Set<String> values=new LinkedHashSet<String>();
		values.add("HCL");
		values.add("Wipro");
		values.add("Infosys");
		values.add("Aspiresystems");
		values.add("CTS");
		values.add("Infosys");
		
		for(String eachvalues :values) {
			System.out.println(eachvalues);
		}
		

	}

}
