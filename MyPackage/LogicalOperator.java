package MyPackage;

public class LogicalOperator {
	
//	1> AND (&&)  : 
	
//	public static void main(String args[]) {
//			
//	   System.out.println(2 > 5 &&  4 == 9); 
//	   System.out.println(2 <= 5 && 2 != 5); 
//	   System.out.println(2 < 5 && 2 > 5); 
//	   System.out.println(2 == 2 && 2 != 5); 
//	 
//	  }
//

// 2> OR (||) : 


//	public static void main(String args[]) {
//		
//		   System.out.println(2 > 5 ||  4 == 9); 
//    	   System.out.println(2 <= 5 || 2 != 5); 
//     	   System.out.println(2 < 5 || 2 > 5); 
//		   System.out.println(2 == 2 || 2 != 5); 
//		   
//	}
	
// Task :
	
	public static void main(String args[]) {
		
	
	     boolean check = true;
		 System.out.println(10 > 45 && 20 < 9 || check && true);
		 System.out.println((true) || 0 < 9 || check || 0 > 0);
		 System.out.println(1 > 5 || 2 < 9 || false && 0 == 0);
		 System.out.println(check && (20 < 9) || 45 != 0 && true);


	}

}
