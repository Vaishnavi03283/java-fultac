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

Own EXception Catch
MyException: age is not eligible, age is 16
        at AgeChecker.check(p5.java:18)
        at Demo.main(p5.java:28)




*/