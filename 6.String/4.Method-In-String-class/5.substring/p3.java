class Demo{
	public static void main(String [] args){
		String s = "Vaishnavi";
		String s1 = new String("Vaishnavi");

		String data = s.substring(3,10);

		System.out.println(data);
	}
}



/*OUTPUT:- StringIndexOutOfBoundsException: Range [3, 10) out of bounds for length 9
														*/