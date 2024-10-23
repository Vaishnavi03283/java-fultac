class Demo{
	public static void main(String [] args){
		StringBuffer sb = new StringBuffer("Virat");
		StringBuffer s = sb.insert(6,"Anushka");
		
		System.out.println(sb);
		System.out.println(s);
	}
}


/*OUTPUT:-  StringIndexOutOfBoundsException: Range [6, 5) out of bounds for length 5				*/