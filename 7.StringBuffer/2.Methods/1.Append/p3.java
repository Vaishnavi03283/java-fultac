class Demo{
	public static void main(String [] args){
		StringBuffer sb = new StringBuffer("virat");
		String s = sb.append("anushka");

		System.out.println(sb);
		System.out.println(s);
	}
}



/*error: incompatible types: StringBuffer cannot be converted to String				*/