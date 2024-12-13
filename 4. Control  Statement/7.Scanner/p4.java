import java.util.*;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int a=sc.nextInt();
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter float");
		float fvalue = sc.nextFloat();
		System.out.println("Enter Double");
		double dvalue = sc.nextDouble();

		System.out.println("number is: "+a);	
		System.out.println("name is: "+name);	
		System.out.println("fvalue is: "+fvalue);	
		System.out.println("dvalue is: "+dvalue);			
	}
}


/*OUTPUT:-

Enter Number
2
Enter name
Vaishnavi
Enter float
2.5
Enter Double
2
number is: 2
name is: Vaishnavi
fvalue is: 2.5
dvalue is: 2.0                                         */