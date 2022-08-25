package ModuleJavaWeek1;

public class CodingChallenge6 {
	
	double width, height, depth;
	
	CodingChallenge6(){
		width = height=depth = 0;
	}

	CodingChallenge6(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}
	
	CodingChallenge6(double l){
		width = height=depth  = l;
	}
	
	double volume() {
		return width*height*depth;
	}
	
	public static void main(String args[]) {
		CodingChallenge6 c1 = new CodingChallenge6();
		CodingChallenge6 c2 = new CodingChallenge6(5,6,7);
		CodingChallenge6 c3 = new CodingChallenge6(8);
		
		double volume;
		volume = c1.volume();
		System.out.println("Volume of shape 1:"+ volume);
		
		volume = c2.volume();
		System.out.println("Volume of shape 2:"+ volume);
		
		volume = c3.volume();
		System.out.println("Volume of shape 3:"+ volume);
		
	}
}
