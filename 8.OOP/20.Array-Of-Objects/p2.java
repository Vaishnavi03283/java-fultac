import java.util.*;

class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[3];

		for(int i=0;i<=2;i++){
			arr[i] = sc.nextInt();
		}

		System.out.println("Array Elements :- ");
		
		for(int i=0;i<=2;i++){
			System.out.println(arr[i]);
		}
	}	
}


/*OUTPUT:-

10
20
30
Array Elements :-
10
20
30





*/