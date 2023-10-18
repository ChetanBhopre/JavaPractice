package Alljava;

public class prime {
	public static void main(String[] args) {
		
		int num =100;
		
		for(int i =1; i<=num;i++) {
			int count=0;
			for(int j=2;j<=i-1;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.println(i + "is a prime no");
			}
		}
	}
}
