class Demo{
	public static void main(String [] args){
		String s = "Vaishnavi";
		s.concat("Jadhav");

		System.out.println(s);
		System.out.println(System.identityHashCode(s));
	}
}


/*OUTPUT:-
Vaishnavi
925858445        (address)                   			*/