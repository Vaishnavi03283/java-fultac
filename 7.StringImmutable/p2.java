class Demo{
	public static void main(String [] args){
		int a = 10;
		System.out.println(System.identityHashCode(a));
		a = 20;
		System.out.println(System.identityHashCode(a));
	}
}





/*OUTPUT:-

925858445
798154996      {Different Address}                */