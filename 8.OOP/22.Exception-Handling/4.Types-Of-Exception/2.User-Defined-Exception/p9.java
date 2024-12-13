//User-Defined-Exception---->>>>(imp*)


import java.io.*;

class MyException extends Exception{
	
	
}

class AgeChecker{

	void check()throws MyException{
		
	}
}
class Demo{
	public static void main(String[]args){
		AgeChecker obj = new AgeChecker();
		obj.check();
	}

}


/*(compile-time-error)

error: unreported exception MyException; must be caught or declared to be thrown
                obj.check();
                         ^







*/