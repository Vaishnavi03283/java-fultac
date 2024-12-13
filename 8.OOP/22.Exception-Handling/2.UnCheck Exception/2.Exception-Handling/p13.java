//Try with Multiple Catch Block :-


class Demo{
	public static void main(String[]args){
		try{
			int arr[] = {10,20};
			System.out.println(arr[2]);
		}catch(ArithmeticException a){
			System.out.println(a);
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println(ex);
		}
	}
}	


/*java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
              

*/