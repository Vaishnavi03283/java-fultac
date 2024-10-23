class Demo{
	public static void main(String [] args){
		StringBuffer sb = new StringBuffer("virat");
		StringBuffer s = sb.delete(7,8);
	
		System.out.println(sb);
		System.out.println(s);
	}
}



/*error :- StringIndexOutOfBoundsException: Range [7, 5) out of bounds for length 5	*/