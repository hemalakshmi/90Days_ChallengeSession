package challengeSession;

public class Day3_CharToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='9';  
		char ch1='c';
		int x=Integer.parseInt(String.valueOf(ch));  
		int y = Character.getNumericValue(ch1); 
		System.out.println(x);  
		System.out.println(y);
	}

}
