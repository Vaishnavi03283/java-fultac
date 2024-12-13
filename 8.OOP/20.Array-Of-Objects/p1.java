import java.util.*;

class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[3];

		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();

		System.out.println("The Array Elements:- ");

		for(int i =0;i<=2 ; i++){
			System.out.println(arr[i]);
		}
	}
}

/*OUTPUT:-

10
20
30
The Array Elements:-
10
20
30

*/