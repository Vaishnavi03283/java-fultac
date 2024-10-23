class Demo{
	public static void main(String [] args){
		StringBuffer sb = new StringBuffer("Virat");
		StringBuffer s = sb.insert(5,"Anushka");
		
		System.out.println(sb);
		System.out.println(s);
	}
}


/*OUTPUT:-	ViratAnushka
		ViratAnushka				*/