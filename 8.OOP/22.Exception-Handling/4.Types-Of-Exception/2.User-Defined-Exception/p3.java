//User Defined Exception :-

class MyException extends Exception {
	
}
class Demo{
	public static void main(String[]args)throws MyException{
		throw new MyException();	
	}
}

/*(Run-Time-Error)

Exception in thread "main" MyException
        at Demo.main(p3.java:8)

*/