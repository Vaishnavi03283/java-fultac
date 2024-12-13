/*Throw Clause :- Used to throw an Exception explisitly and catch it..*/

class Demo{
	public static void main(String[]args){
		try{
			throw new ArithmeticException();
		}catch(ArithmeticException e){
			System.out.println(e);
		}
	}
}


/*java.lang.ArithmeticException
*/