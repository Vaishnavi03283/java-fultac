//User Defined Exception :-

class MyException extends Exception {
	
}
class Demo{
	public static void main(String[]args){
		try{
			throw new MyException();
		}catch(MyException e){
			System.out.println("My Own Exception catched");
			e.printStackTrace();
		}
	}
}

/*(Run-Time-Error)

My Own Exception catched
MyException
        at Demo.main(p4.java:9)


*/