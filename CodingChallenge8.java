package ModuleJavaWeek1;

public class CodingChallenge8 {

	int var1 = 10;
	static int var2 = 10;
	
	void method() {
		var1++;
		System.out.println("Method1:"+ var1);
	}
	
	void method2() {
		var2++;
		System.out.println("Method2:"+ var2);
	}
	public static void main(String[] args) {
		CodingChallenge8 c1 = new CodingChallenge8();
		CodingChallenge8 c2 = new CodingChallenge8();
		CodingChallenge8 c3 = new CodingChallenge8();

		c1.method();
		c1.method2();
		
		c2.method();
		c2.method2();
		
		c3.method();
		c3.method2();
	}

}
