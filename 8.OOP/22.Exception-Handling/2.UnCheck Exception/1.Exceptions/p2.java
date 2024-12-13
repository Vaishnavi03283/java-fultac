class Demo{
	public static void main(String[]args){
		System.out.println(10/0);
		//throw new ArithmeticException(" / by zero");---->>internal created this object by JVM
	}
}


/* Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Demo.main(p2.java:3) */