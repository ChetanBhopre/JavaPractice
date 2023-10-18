package MostIMP;

import java.util.LinkedHashSet;

public class notes {
	public static void main(String[] args) {
		

	}
	
	void removed_Dupliacte_String () {
		String a="java";

		//step 1: convert string into char [] array
						
						char [] b = a.toCharArray();

		//step 2: create object of LinkedHashSet so we can add one by one value in hashSet
					LinkedHashSet hs = new LinkedHashSet();	

		//step 3: iterate the all array value inside or add value into linkedHashSet
					
					for(int i=0;i<b.length;i++)
					{

							hs.add(b[i]);
					}
		//step 4: print linkedList
				System.out.println(hs);

	}

}
