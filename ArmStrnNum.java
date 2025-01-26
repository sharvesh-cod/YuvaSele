package week1.day2;

public class ArmStrnNum {

	public static void main(String[] args) {

		int input =214;
		int arm = 0;
		int givenum = 214;
		
	
		
		
		
		
		
		while (input >0)
		{
			int rem = input%10;
			arm = arm + rem*rem*rem;
		
		input = input/10;
			
			
		}
		
System.out.println(arm);
if (arm == givenum)
	System.out.println("Armstrong num");
else 
	System.out.println("Not Armstrong numbers");
	}

}
