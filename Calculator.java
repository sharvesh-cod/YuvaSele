package week1.day2;

public class Calculator {

	public int add(int a ,int b)
	{
		int sum = a+b;
		return sum;
		
	}
	
	public double sub(double a, double b)
	{
		
		double diff = a - b;
		return diff;
		
	}
	public double mul(double a, double b)
	{
		double multi = a*b;
		return multi;
	}
	
	public int div(int a, int b)
	{
		int divi = a/b;
		return divi;
	}
	public static void main(String[] args) {
	
		Calculator cal = new Calculator ();
		System.out.println(cal.add(4, 4));
		double subtr = cal.sub(4, 4);
		System.out.println(subtr);
		System.out.println(cal.mul(4, 4));
		int divis = cal.div(4, 4);
		System.out.println(divis);
		

	}

}
