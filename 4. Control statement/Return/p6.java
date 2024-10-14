class Demo{
	public static void main(String [] args){
		kirana (10.5);
	}

	static int kirana(int a){
		System.out.println("in fun method");
		return 10.5;
	}
}




/*error: incompatible types: possible lossy conversion from double to int
                kirana (10.5);

error: incompatible types: possible lossy conversion from double to int
                return 10.5;                                                         */
