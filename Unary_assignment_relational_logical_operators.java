package lecture_week2;

public class Unary_assignment_relational_logical_operators {

	public static void main(String[] args) {
		
		//casting samples:

		byte b;
		int i=120;
		double d=522.33;
		float f=71.222f;
		char c='A';
		
		c=(char)i;
		System.out.println("i = " + i + " c = " + c);
		
		i=(int)d;
		
		System.out.println("d = " + d + " i = " +i);
		
		i=(int)f;
		System.out.println("f = " + f + " i = " +i);

		b=(byte)d;
		System.out.println("d = " + d + " b = " +b);
		
		

		
		//mixed integer operations:
		
		int i1 = 5;
		int i2 = 10;
		float f1 = 15.23f;
		double d1 = 20.5;
		
		int res1 = i1 + i2;
		float res2 = i1 + f1; // bigger one should data type
		double res3 = i2+d1;
		
		
		
		/*in calculations, if byte or short is used, then it is 
		 * converted to  int. thus it should be converted to int or any bigger data type or casting to short / byte. E.g.:
		 */
		short firstNumber=10;
		short secondNumber=20;
		
		int thirdNumber = firstNumber + secondNumber;
		short thirdNumber2 = (short) (firstNumber + secondNumber);

		int b1=20;
		int b2=30;
		
		byte res= (byte)(b1+b2); // casting is required.
		byte res4 = 20+30; // no casting required as it is in the byte range and not given in the var. If it is in Var, casting required becasue in Var the next value might be out of byte range
		

		
		
		
		
		
	}

}
