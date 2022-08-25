package ModuleJavaWeek1;

public class CodingChallenge5 {
	int a1;float a2;String c1;char d1;
	
	public CodingChallenge5() { 
	      System.out.println("I am default constructor.");
	}

	public CodingChallenge5(int a,float b,String c,char d) {
		   System.out.println("I am Parameterized constructor. I take various arguments as input.");
		   a1 = a;
		   a2= b;
		   c1 = c;
		   d1 = d;
	}

	public void observations(){ 

	       System.out.println("inside Observations method");
	       System.out.println("Square of integer"+a1*a1);
	       System.out.println("Square of float"+a2*a2);
	       System.out.println("String value is"+c1);
	       System.out.println("character value is"+d1);

	      }

	  public static void main(String[] args) {
		  CodingChallenge5 c1 = new CodingChallenge5();
		  c1= new CodingChallenge5(10, 5.5F, "Remya", 'D'); 
		  c1.observations();
	  
	  }

}
