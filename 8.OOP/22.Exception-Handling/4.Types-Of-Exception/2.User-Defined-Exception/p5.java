//User-Defined-Exception---->>>>(imp*)


import java.io.*;

class MyException extends Exception{
	
	MyException(String s){
		super (s);
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
		try{
			obj.check();
		}catch(MyException e){
			System.out.println("Own EXception Catch");
			e.printStackTrace();
		}
	}

}


/*OUTPUT:-   age is not eligible, age is 16*/