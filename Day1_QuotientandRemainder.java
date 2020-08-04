package challengeSession;

import java.util.Scanner;

public class Day1_QuotientandRemainder {
	 public static void main(String[] args) {
		
		  int a,b;
		  System.out.println("Enter the first numb");
		  Scanner sc= new Scanner(System.in);
		  a=sc.nextInt();
		  System.out.println("Enter the second numb");
		  b=sc.nextInt();
		  int c= a % b;
		  System.out.println("Reminder:" + c); 
		  int d=a/b; 
		  System.out.println("Quotient:" + d);
		  sc.close();
		 
		
	 }
}
