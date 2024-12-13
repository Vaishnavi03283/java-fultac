//User Defined Exception :-

class MyException {
	
}
class Demo{
	public static void main(String[]args){
		throw new MyException();	
	}
}

/*(Compile-Time) error: incompatible types: MyException cannot be converted to Throwable
                throw new MyException();
                ^

*/