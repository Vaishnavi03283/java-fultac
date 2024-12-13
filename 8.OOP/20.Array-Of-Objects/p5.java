//Array of Object Code---------

import java.util.*;

class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
	
		Emp arr[] = new Emp[3];
		for(int i=0;i<=2;i++){
			System.out.println("Enter name :-");
			String str = sc.next();
			arr[i] = new Emp(str);
		}
	
		System.out.println("Array is :- ");

		for(int i=0;i<=2;i++){
			System.out.println(arr[i].name);
		}
	}
}


/*OUTPUT:-

Enter name :-
Vaishnavi
Enter name :-
Shankar
Enter name :-
Jadhav
Array is :-
Vaishnavi
Shankar
Jadhav


*/