class Demo{
	public static void main(String [] args){
		int a = 10;
		int b = 20;
		
		int c = ++a + ++a + a++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}


13
20
35