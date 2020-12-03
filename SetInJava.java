package week4assignment.org.system;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetInJava {

	public static void main(String[] args) {
		Set<String>values=new HashSet<String>();
		
		String text="munni munni fazil fazil lovers";
		String[] word=text.split(" ");
		
		for(int i=0;i<word.length;i++) {
			//System.out.println(word[i]);
		     values.add(word[i]);

		}
		System.out.println(values);
	}
	}

