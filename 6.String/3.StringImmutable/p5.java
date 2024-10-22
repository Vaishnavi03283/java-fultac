class Demo{
	public static void main(String [] args){
		String s1 = "Data";
		System.out.println(System.identityHashCode(s1));
	
		String s2 = "Base";
		System.out.println(System.identityHashCode(s2));

		s1 = s1 + s2;
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
	}

}



/*OUTPUT:-

925858445                {  100
798154996                   200
DataBase 		    DataBase
1450495309		    3000                (3 different address)                    */