package NessDigital;

public class StringAndWord {

	public static void main(String[] args) {
		String a ="Che<=tan@8391+";
		for(int i=0; i<=a.length()-1;i++) {
			char value=a.charAt(i);
			
//			if(Character.isDigit(value)) {
//				System.out.print( " "+value);
//				
//			}
//			if(Character.isLetter(value)) {				
//				System.out.print(value);
//			}
			if(value=='i'||value=='e') {
				System.out.println(value);
			}
		}

	}

}
