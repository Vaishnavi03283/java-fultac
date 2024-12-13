//step-3)- finally  (code cleanup)

class Demo{
	public static void main(String[]args){
		try{
			System.out.println(10/0);
			int arr[] = {10,20};
			System.out.println(arr[2]);
		}catch(ArithmeticException e){
			System.out.println(e);
		}finally{
			System.out.println("code clean up");
		}
		System.out.println("after try catch");
	}
}


/*(Run-Time-errors)
java.lang.ArithmeticException: / by zero
code clean up
after try catch

*/