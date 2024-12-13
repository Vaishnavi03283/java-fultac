class Demo{
	public static void main(String[]args){
		try{
			System.out.println(10/0);     //new ArithmeticException();
		}catch(ArithmeticException e ){
			System.out.println(e);
		}
	}
}

//java.lang.ArithmeticException: / by zero