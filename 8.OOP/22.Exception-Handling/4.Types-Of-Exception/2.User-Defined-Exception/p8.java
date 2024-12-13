//User-Defined-Exception---->>>>(imp*)


import java.io.*;

class MyException extends Exception{
	
	
}

class AgeChecker{

	void check(){
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

 error: unreported exception MyException; must be caught or declared to be thrown
                throw new MyException();
                ^





*/