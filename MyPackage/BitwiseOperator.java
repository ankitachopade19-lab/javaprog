package MyPackage;

public class BitwiseOperator {
	
	public static void main(String[] args) {
		
		System.out.println(Integer.toBinaryString(2)); //Wrapper class
		
		// AND Operator ---> & 
		
		int a = 2,
		    b = 5;
		System.out.println(a & b); //0
		
		// OR Operator ---> |
		
		int c = 4,
			d = 5;
		System.out.println(c | d); //5
		
		// XOR Operator ---> ^
		
		int m = 8,
			n = 2;
		System.out.println(m ^ n);  //10
		
		// Compliment operator ---> ~
		
		int h = -9;
		System.out.println(~h);  //8
		
		// LeftShift Operator ---> <<
		
		int q = 12,
			r = 2;
		System.out.println(q << r); //48
		
		// RightShift operator ---> >>
		
		int s = 30,
			t = 3;
		System.out.println(s >> t);  //3
			
	}

}
