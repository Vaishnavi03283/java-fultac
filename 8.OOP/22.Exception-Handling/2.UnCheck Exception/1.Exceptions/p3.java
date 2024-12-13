class Demo{
	public static void main(String[]args){
		System.out.println("Hello");
		System.out.println(10/0);		
		System.out.println("hello");
	}
}


/* Hello
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Demo.main(p3.java:4)

 */