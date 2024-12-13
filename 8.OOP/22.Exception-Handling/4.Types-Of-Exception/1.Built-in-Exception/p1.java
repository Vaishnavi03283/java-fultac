//NullPointerException-->>>


class Demo{
	int a = 10;

	public static void main(String[]args){
		Demo d = null;
		System.out.println(d.a);
	}
}


/*Exception in thread "main" java.lang.NullPointerException: Cannot read field "a" because "<local1>" is null
        at Demo.main(p1.java:10)
*/