class Demo {
	public static void main (String [] args){
		int x = 4;
		int y = 5;

		boolean c = ++x > ++y && ++x > y++;
		System.out.println(x);
		System.out.println(y);
		System.out.println(c);
	}
}


5
6
false