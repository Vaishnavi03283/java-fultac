class Demo{
	public static void main(String [] args){
		String s = "Vaishnavi";
		System.out.println(System.identityHashCode(s));
		s = "Vaishnavi";
		System.out.println(System.identityHashCode(s));
	}
}



/*OUTPUT:-

925858445
925858445    {Different Address}            */