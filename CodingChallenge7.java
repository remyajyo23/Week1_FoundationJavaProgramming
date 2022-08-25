package ModuleJavaWeek1;

public class CodingChallenge7 {

	final double pi = 3.14;
	double radius,area;
	
	CodingChallenge7(int r){
		radius = r;
	}
	double area() {
		double area = pi*3.14*radius*radius;
		return area;
	}
	public static void main(String[] args) {
		CodingChallenge7 c1 = new CodingChallenge7(20);
		double area = c1.area();
		System.out.println("Area of circle is:"+area);
	}

}
