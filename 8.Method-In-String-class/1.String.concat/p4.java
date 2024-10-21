class Demo{
	public static void main(String [] args){
		String s = "Vaishnavi";
		System.out.println(System.identityHashCode(s));
		System.out.println(s);

		s = s.concat("Jadhav");
		System.out.println(System.identityHashCode(s));
		System.out.println(s);
	}
}


/*OUTPUT:-

1690859824		(address)
Vaishnavi
1074593562		(address)
VaishnaviJadhav                 		        */