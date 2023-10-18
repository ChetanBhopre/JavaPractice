package Alljava;

import java.util.Scanner;

import java.util.Scanner;

public class primeNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input:");
        int num = sc.nextInt();
     //   primeNo(num);
        if(primeNo(num)) {
        	System.out.println("prime");
        }
        else {
        	System.out.println("no");
        }
        
    }

    public static boolean primeNo(int value) {
        int count = 0;
        
        for (int i = 1; i <= value; i++) {
            if (value % i == 0) {
                count++;
            }
        }
        
        if (count == 2) {
            return true;
        } else {
            return false;
        }
        
       
        
    }
}
