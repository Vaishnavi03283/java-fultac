//User-Defined-Exception---->>>>(imp*)


import java.io.*;

class MyException extends Exception{
	
	
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
		try{
			obj.check();
		}catch(MyException e){
			System.out.println("Own EXception Catch");
			e.printStackTrace();
		}
	}

}


/*error: constructor MyException in class MyException cannot be applied to given types;
                        throw new MyException("age is not eligible, age is "+age);
                              ^
  required: no arguments
  found:    String
  reason: actual and formal argument lists differ in length




*/