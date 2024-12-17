//Unboxing :- converting object into corresponding primittive datatype is called Unboxing.


class Demo{
	public static void main(String[]args){
		int obj = 40;
		System.out.println(System.identityHashCode(obj));
		obj = 10;
		System.out.println(System.identityHashCode(obj));
	}
}


/*
OUTPUT:-

925858445
798154996


*/