import java.util.*;

class Demo{
	public static void main(String [] args){
		Scanner SC = new.Scanner(System.in );
		System.out.println("Enter Number");
		int a=SC.nextInt( );
		System.out.println("Enter name");
		String name = SC.next( );
		System.out.println("Enter float");
		float fvalue = SC.nextFloat( );
		System.out.println("Enter Double");
		double dvalue = SC.nextDouble( );

		System.out.println("number is: "+a);	
		System.out.println("name is: "+name);	
		System.out.println("fvalue is: "+fvalue);	
		System.out.println("dvalue is: "+dvalue);			
	}
}