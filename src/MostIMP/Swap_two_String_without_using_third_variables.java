package MostIMP;

public class Swap_two_String_without_using_third_variables {
	
	public static void main(String[] args) {
		String a = "java";

		String b = "selenium";
		
		a=a+b;
		System.out.println(a);//javaselenium
		
		b=a.substring(0,a.length()-b.length());//4 len
		System.out.println(b);//java
	
		//javaselenium
		a=a.substring(b.length());//selenium
		
		System.out.println("----------------------");
		System.out.println(a);
		System.out.println(b);
		
	}
	

}
