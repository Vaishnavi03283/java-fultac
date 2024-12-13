//Try with Multiple Catch Block :-


class Demo{
	public static void main(String[]args){
		try{
			int arr[] = {10,20};
			System.out.println(arr[2]);
		}catch(ArithmeticException a){
			System.out.println(a);
		}catch(ArrayIndexOutOfBoundsException ex){
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		}
	}
}	


/*java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
        at Demo.main(p14.java:8)
Index 2 out of bounds for length 2

              

*/