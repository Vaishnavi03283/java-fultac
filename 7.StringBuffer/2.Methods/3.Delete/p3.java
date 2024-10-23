class Demo{
	public static void main(String [] args){
		StringBuffer sb = new StringBuffer("virat");
		StringBuffer s = sb.delete(2,9);

		System.out.println(sb);
		System.out.println(s);
	}
}


/*OUTPUT:-   	vi
		vi				*/