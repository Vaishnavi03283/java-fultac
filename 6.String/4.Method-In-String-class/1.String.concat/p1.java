class Demo{
	public static void main(String [] args){
		String s = "Vaishnavi";
		String.concat("Jadhav");

		System.out.println(s);
	}
}



/*error: non-static method concat(String) cannot be referenced from a static context
                String.concat("Jadhav");
                      ^                                     */