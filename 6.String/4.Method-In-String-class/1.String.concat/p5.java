class Demo{
	public static void main(String [] args){
		String s = "Vaishnavi";
		System.out.println(System.identityHashCode(s));
		System.out.println(s);

		String s1 = s.concat("Vaishnavi");
		System.out.println(System.identityHashCode(s1));
		System.out.println(s1);
	}
}


/*OUTPUT:-
925858445			(address)
Vaishnavi
798154996			(address)
VaishnaviVaishnavi		
									*/