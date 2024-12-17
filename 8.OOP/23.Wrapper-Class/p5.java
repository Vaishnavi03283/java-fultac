class Demo{
	public static void main(String[]args){
		int obj = new Integer(40);
		System.out.println(System.identityHashCode(obj));
		obj = new Integer(40);
		System.out.println(System.identityHashCode(obj));

		String s = new String("Vaishnavi");
		System.out.println(System.identityHashCode(s));
		s = new String("Vaishnavi");
		System.out.println(System.identityHashCode(s));
		
	}
}


/*OUTPUT:-


(Int):- Address
925858445
925858445

(String):- Address
798154996
681842940



*/