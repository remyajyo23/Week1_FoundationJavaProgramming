package ModuleJavaWeek1;

public class CodingChallenge4 {
	
	CodingChallenge4(){
		System.out.println("Default Constructor");
	}
	
	CodingChallenge4(int a,int b){
		System.out.println("a is"+a);
		System.out.println("b is"+b);
	}

	public static void main(String[] args) {
		CodingChallenge4 c1 = new CodingChallenge4();
		c1 = new CodingChallenge4(10,20);

	}

}
