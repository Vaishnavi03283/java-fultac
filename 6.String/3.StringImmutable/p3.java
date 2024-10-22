class Demo{
	public static void main(String [] args){
		String s = new String("Vaishnavi");
		System.out.println(System.identityHashCode(s));
		s = new String("Vaishnavi");
		System.out.println(System.identityHashCode(s));
	}
}



/*OUTPUT:-

925858445
798154996    {Different Address}         */