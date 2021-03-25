package lecture_week2;

public class Unary_assignment_relational_logical_operators {

	public static void main(String[] args) {


// casting samples:

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

		
	}

}
