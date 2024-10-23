class Demo{
	public static void main(String [] args){
		StringBuffer sb = new StringBuffer("Virat");
		StringBuffer s = sb.append("Anushka");

		System.out.println(System.identityHashCode(sb));
		System.out.println(System.identityHashCode(s));
		System.out.println(sb);
		System.out.println(s);
	}
}



/*OUTPUT:-  	1567885839
		1567885839
		ViratAnushka
		ViratAnushka
*/