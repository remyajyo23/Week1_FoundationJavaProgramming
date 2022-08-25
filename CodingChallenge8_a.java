package ModuleJavaWeek1;

public class CodingChallenge8_a {
	int var1 = 10;
	//final int var2 = 10;
	int var2 = 10;
	void method() {
		var1++;
		System.out.println("Method1:"+ var1);
	}
	
	void method2() {
		var2++;
		System.out.println("Method2:"+ var2);
	}
	public static void main(String[] args) {
		CodingChallenge8_a c1 = new CodingChallenge8_a();
		CodingChallenge8_a c2 = new CodingChallenge8_a();
		CodingChallenge8_a c3 = new CodingChallenge8_a();

		c1.method();
		c1.method2();
		
		c2.method();
		c2.method2();
		
		c3.method();
		c3.method2();
	}


}
