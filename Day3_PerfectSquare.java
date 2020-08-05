package challengeSession;

import java.util.Scanner;

public class Day3_PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any number: ");
		Scanner scanner = new Scanner(System.in);
		double numb = scanner.nextDouble(); 
		scanner.close();
		double sr = Math.sqrt(numb); 
		System.out.println(sr);
		double rv = Math.floor(sr);
		System.out.println(rv);
		if(Double.compare(sr,rv)==0) {
		 System.out.println(numb + " is a perfect square number");
		}
		  else {
			  System.out.print(numb + " is not a perfect square number");
		  }
		 
	}

}
