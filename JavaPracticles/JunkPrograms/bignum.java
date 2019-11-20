// Find the Biggest Number among given two values & Add those two values

class AdditionOfTwoValues{
	
	public static void main(String...abc){
		
		Object o="12";
		java.io.Serializable s=45.;
		int i=Integer.valueOf(o.toString());
		System.out.println("Value of Object o is"+i);
		double d=Double.valueOf(s.toString());
		System.out.println("Value of s is"+d);
		double add=i+d;
		System.out.println("Addition of the two numbers is"+add);
		
			//Finding the biggest value among two values
			
			if(i>d){
				System.out.println("Biggest value is "+i);
			}else{
				System.out.println("Biggest value is "+d);
			}	
	}
}