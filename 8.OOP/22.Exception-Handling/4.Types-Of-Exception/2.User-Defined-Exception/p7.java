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


/*(Run-time-error)

Exception in thread "main" MyException
        at AgeChecker.check(p7.java:15)
        at Demo.main(p7.java:21)




*/