package challengeSession;

import java.util.Scanner;

public class Day2_FloydsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int rows;
System.out.println("Enter the number of rows: ");
Scanner sc= new Scanner(System.in);
rows = sc.nextInt();
sc.close();

int num=1;
for(int eachRow=1;eachRow<=rows;eachRow++) {
	for(int eachcol=1;eachcol<=eachRow;eachcol++) {
		System.out.format("%-3d", num++);
		//System.out.format("*", num++);
	}
	System.out.println("");
}

}

}
