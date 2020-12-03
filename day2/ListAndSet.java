package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListAndSet {

	//private static int i;

	public static void main(String[] args) {
		
		String[] input= {"hcl","wipro","aspire","cts"};
		
		List<String> listvalues=new ArrayList<String>();
		
		for(String each:input) {
			listvalues.add(each);}
		
		Collections.sort(listvalues);
			Collections.reverse(listvalues);
			
			/*for (String var : listvalues) {
				//System.out.println(listvalues);
				
				String[] array = new String[1];
				int i = 0;
				array[i]=var;
				System.out.println(array[i]);
				
				
				//System.out.print(var+" ");
*/				String[] array = new String[4];

				for(int i=0;i<listvalues.size();i++) {
					
					array[i]=listvalues.get(i);
					System.out.println(array[i]);
					
			}
		
	}

}
