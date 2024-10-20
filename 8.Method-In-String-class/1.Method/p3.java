class Demo{
	public static void main(String [] args){
		String s = "Vaishnavi";
		String s1 = s.concat("Jadhav");
		
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
	}
}
/*OUTPUT:-
Vaishnavi
107456312		(address)
VaishnaviJadhav
921760190		(address)
*/