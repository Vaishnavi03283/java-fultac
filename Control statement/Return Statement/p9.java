class Demo{
	public static void main(String [] args){
		kirana();
	}
	
	static int kirana(int ch){
		System.out.println("in fun method "+ch);
		return 10;
	}
}



error: method kirana in class Demo cannot be applied to given types;
                kirana();
                ^
  required: int
  found:    no arguments
  reason: actual and formal argument lists differ in length