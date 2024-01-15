package session_06;

public class Test {
	
	public static void main(String[] args) {
		
		//Bank b1 = new Bank();//CTE - cannot be Instantiated
		
		/*
		 * Bank b = new BOI(); System.out.println("BOI = "+b.getROI());
		 */
		/*
		 * Shape s = new Circle(5); System.out.println("Area of Circle = "+s.area());
		 */
		
		
		Calculations c = new Calculations();
		System.out.println("Addition = "+c.add(10, 20));
		System.out.println("Substraction = "+c.sub(12, 6));
		System.out.println("Factorial = "+c.fact(5));
		System.out.println("Average = "+c.avg(3, 4));
		System.out.println("Minimum = "+c.min(5, 7));
	
		//ArithCal a = new ArithCal();
		
		
	}

}
