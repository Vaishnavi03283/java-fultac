//User-Defined-Exception---->>>>(imp*)


import java.io.*;

class MyException extends Exception{
	
	
}

class AgeChecker{

	void check()throws MyException{
		throw new MyException();
	}
}
class Demo{
	public static void main(String[]args)throws MyException{
		AgeChecker obj = new AgeChecker();
		obj.check();
	}

}


/*(compile-time-error)

Exception in thread "main" MyException
        at AgeChecker.check(p8.java:14)
        at Demo.main(p8.java:20)






*/