class Demo{
	public static void main(String [] args){
		StringBuffer sb = new StringBuffer("Virat");
		StringBuffer s = sb.insert(0,"Anushka");

		System.out.println(sb);
		System.out.println(s);
	}
}



/*OUTPUT:-  	AnushkaVirat
		AnushkaVirat				*/