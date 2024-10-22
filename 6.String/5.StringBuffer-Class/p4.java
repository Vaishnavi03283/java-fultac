class Demo{
	public static void main(String [] args){
		String s = new String("Virat");
		System.out.println(s);
		System.out.println(System.identityHashCode(s));

		String s1 = s.concat("Anushka");
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));

		StringBuffer name = new StringBuffer("Vaishnavi");
		System.out.println(System.identityHashCode(name));

		name.append("Jadhav");
		System.out.println(name);
		System.out.println(System.identityHashCode(name));
	}
}



/*OUTPUT:-   

	Virat
	925858445
	ViratAnushka
	798154996
	681842940
	VaishnaviJadhav
	681842940			    (i.e      String class - immutable (can't modify)
						 StringBuffer class -  mutable (modify) )

*/