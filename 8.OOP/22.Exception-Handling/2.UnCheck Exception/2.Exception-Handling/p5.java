class Demo{
	public static void main(String[]args){
		try{
			System.out.println(10/0);     //new ArithmeticException();
		}catch(ArithmeticException e ){
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}
	}
}

/*java.lang.ArithmeticException: / by zero
        at Demo.main(p5.java:4)

*/