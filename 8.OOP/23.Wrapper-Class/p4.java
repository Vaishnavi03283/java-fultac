class Demo{
	public static void main(String[]args){
		Integer obj = new Integer(40);
		System.out.println(System.identityHashCode(obj));
		obj = new Integer(10);
		System.out.println(System.identityHashCode(obj));

		String obj1 = new String("Vaishnavi");
		System.out.println(System.identityHashCode(obj1));
		obj1 = new String("Sai");
		System.out.println(System.identityHashCode(obj1));
		
	}
}




/*OUTPUT:-

(Integer)--Address
925858445
798154996

(String)--Address
681842940
1392838282


*/