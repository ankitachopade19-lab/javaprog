package MyPackage;

public class IncDecHW {
	
	public static void main(String arg[]) {
		
		int i =90;
		i++; //90  //91
		
		int j= i+9; //100
		System.out.println(i++); //91 //92
		
		--j;  //99
		System.out.println(j*i); // 99 * 92 = 9108
		
		i++; //93
		--i; //92
		System.out.println(--i);  //91
		
		++i; //92
		System.out.println(j+3);  // 99 + 3 = 102
		
		j--;  //99  //98
		++j;  //99
		System.out.println(j+7);  //99 + 7 = 106
		
		j--;  //99 //98
		i++;  //93 
		--i;  //92
		System.out.println(i+j);  // 92 + 98 = 190
		System.out.println(i);  //92
		System.out.println(j);  //98
		 
	}

}
