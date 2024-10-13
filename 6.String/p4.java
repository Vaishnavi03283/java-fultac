class Demo{
	public static void main(String [] args){
		String name = "viraj koli";
		String name1 = "viraj koli";

		System.out.println(System.identityHashCode(name));
		System.out.println(System.identityHashCode(name1));
	}
}


/* OUTPUT:-  925858445
	     925858445     (address)     */
	