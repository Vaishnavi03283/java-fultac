class Demo{
	public static void main(String[]args){
		try{
			System.out.println(10/0);     //new ArithmeticException();
		}catch(ArithmeticException e ){
			System.out.println("ganit shika....");
		}
	}
}

//OUTPUT:- ganit shika....