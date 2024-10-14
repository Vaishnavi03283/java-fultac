import java.util.*;

class Demo{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in );
		System.out.println("Enter Number");
		int a=sc.nextInt( );
		System.out.println("Enter name");
		String name=sc.next( );
		System.out.println("Enter float");
		float fvalue=sc.nextFloat( );
		System.out.println("Enter Double");
		double dvalue=sc.nextDouble( );

		System.out.println("number is: "+a);	
		System.out.println("name is: "+name);	
		System.out.println("fvalue is: "+fvalue);	
		System.out.println("dvalue is: "+dvalue);			
	}
}