package MyPackage;

public class IncreDecreOperator {
	
	public static void main(String args[]) {
	
	int a = 5;
	System.out.println(a - 1); //4

	int b = 7;
	System.out.println(b++);  //7

	System.out.println(a--); //5
	System.out.println(a);  //4

    System.out.println("------------------------");
	
	
	int i = 11;
	int j = i++; //11  
	System.out.println(j);
	
	int s = 25;
	--s;
	System.out.println(s);  //24
	
	--s;  //23
	System.out.println(s); //23
	
	s++;  //23
	System.out.println(s); //24
	
	System.out.println("-----------------------");
	
	int c=12;
	System.out.println(c++);  //12 
	c++; //13 //14
	--c; //13
	System.out.println(c); //13
	
	System.out.println("---------------------");
	
    int d = 8;
    System.out.println(d--);//8 
    --d; //7  //6
    d++;  //6 //7
    System.out.println(d+2);  //9
    d--; //7 //6
    ++d; //7
    System.out.println("-----------------------");
    System.out.println(++d);  //8
    System.out.println(d--); //8  
    System.out.println(++d);  //7 //8
    System.out.println(--d); //7
    
    --d; //7  //6
    d++; //6  //7
    ++d; //7  //8
    d--; //8 //7
    System.out.println(--d); //6
    System.out.println(++d);//7
	
	
	}	
}