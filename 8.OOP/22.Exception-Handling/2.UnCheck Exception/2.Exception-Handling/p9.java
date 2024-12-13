//Try with Multiple Catch Block :-


class Demo{
	public static void main(String[]args){
		try{
			System.out.println(10/0);   //new ArithmeticException(" / by zero")
		}catch(ArithmeticException a){
			System.out.println(a);
		}catch(Exception e ){
			System.out.println(e);
		}
	}
}	


/*java.lang.ArithmeticException: / by zero

*/