package challengeSession;

public class Day1_ComplexNumber{
int real,img;

Day1_ComplexNumber(int r,int i){
	real=r;
	img=i;
}
public static Day1_ComplexNumber addComplex(Day1_ComplexNumber c1,Day1_ComplexNumber c2) {
	Day1_ComplexNumber result= new Day1_ComplexNumber(0, 0);
	result.real=c1.real+c2.real;
	result.img=c1.img+c2.img;
	return result;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Day1_ComplexNumber c1=new Day1_ComplexNumber(4,5);
Day1_ComplexNumber c2=new Day1_ComplexNumber(4,8);
Day1_ComplexNumber result1 = addComplex(c1,c2);
System.out.println("Sum is " + result1.real+ "+i"+ result1.img);
	}

}
