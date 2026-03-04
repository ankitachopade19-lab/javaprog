package MyPackage;

public class AssignmentOperator {
	
	public static void main(String args[]) {
		
//		int x = 2;
//	    
//		System.out.println(x %= 3);
//		System.out.println(x /= 45);
//		System.out.println(x /= 4);
//		System.out.println(x %= 5);
		

		int i=3;
		
		i++; //4
		--i;  //3
		
		System.out.println(i++); //3
		
		i++; //4 //5
		System.out.println(i % 4); // 5%4 = 1
		
		--i;  //4
		System.out.println(i += 5); //5+4 = 9
		i++;  //10
		
		int b = i+2; //12
		System.out.println(i++); //10  //11
		
		--i; //11 //10
		i %= 4; //11%4 = 3
		System.out.println(i++); //2  //3
		
		++i;  //4
		System.out.println(i+4); // 4 + 4 = 8
		System.out.println(i);	//4
		
	}

}
