class Demo{
	public static void main(String [] args){
		StringBuffer sb = new StringBuffer("virat");
		StringBuffer s = sb.append("kohli");

		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
	}
}


/*OUTPUT:-   viratkohli
	     925858445					*/