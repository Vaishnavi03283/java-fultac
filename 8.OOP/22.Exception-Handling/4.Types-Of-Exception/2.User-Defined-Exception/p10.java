//User-Defined-Exception---->>>>(imp*)


import java.io.*;

class MyException extends Exception{
	
	MyException(String str){
		super(str);
	}	
}

class AgeChecker{

	void check()throws MyException{
		int age = 16;
		if(age<18){
			throw new MyException("age is not eligible, age is "+age);
		}else{
			System.out.println("can Vote");
		}
	}
}
class Demo{
	public static void main(String[]args)throws MyException{
		AgeChecker obj = new AgeChecker();
		obj.check();
	}

}


/*error: run time error

Exception in thread "main" MyException: age is not eligible, age is 16
        at AgeChecker.check(p10.java:18)
        at Demo.main(p10.java:27)


*/