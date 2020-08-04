package challengeSession;

import java.util.Random;

public class Day2_RandomNumb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random rn=new Random();
System.out.println("Random Numbers: ");
for (int i = 0; i <= 5; i++) {
   System.out.println(rn.nextInt(500));
}
	}

}
