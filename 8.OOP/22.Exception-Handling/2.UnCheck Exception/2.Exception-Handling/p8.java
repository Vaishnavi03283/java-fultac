//Try with Multiple Catch Block :-


class Demo{
	public static void main(String[]args){
		try{
			System.out.println(10/0);   //new ArithmeticException(" / by zero")
		}catch(Exception e ){
			System.out.println(e);
		}catch(ArithmeticException a){
			System.out.println(a);
		}
	}
}	


/*error: exception ArithmeticException has already been caught
                }catch(ArithmeticException a){
                 ^
*/