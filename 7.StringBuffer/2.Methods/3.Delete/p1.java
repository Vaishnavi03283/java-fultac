class Demo{
	public static void main(String [] args){
		StringBuffer sb = new StringBuffer("Virat");
		StringBuffer s = sb.delete(0,2);

		System.out.println(sb);
		System.out.println(s);
	}
}

/*OUTPUT:-	rat
		rat				*/