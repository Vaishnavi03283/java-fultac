class Demo{
	public static void main (String [] args){
		int a = 5;
		int b = 8;
		int c = ++a + a-- - a-- * b++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}


4
9
-28