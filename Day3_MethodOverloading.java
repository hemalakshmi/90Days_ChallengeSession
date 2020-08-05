package challengeSession;

public class Day3_MethodOverloading {

	public int numb(int a,int b) {
		int add= a+b;
		return add;
	}
	public int numb(int a,int b,int c) {
		int add= a+b+c;
		return add;
	}
	public float numb(float a,float b,float c) {
		float add= a+b+c;
		return add;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day3_MethodOverloading mo= new Day3_MethodOverloading();
		int x=mo.numb(2,3);
		System.out.println("Sum of two numbers: "+ x);
		int y=mo.numb(11,22,33);
		System.out.println("Sum of three numbers: "+ y);
		float z=mo.numb(5.5f,8f,3.6f);
		System.out.println("Sum of four numbers: "+ z);
	}

}
