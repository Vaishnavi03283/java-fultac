class Demo {
	public static void main (String [] args){
		int x = 10;
		int y = 20;
		
		boolean z = ++x > ++y || ++x > y++;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}


12
22
false
