class Emp{
	
	 String toString(){
		return "100";	
	}
}
class Demo{
	public static void main(String[]args){
		Emp e = new Emp();
		Emp e1 = new Emp();

		System.out.println(e);
		System.out.println(e1);
		
	}
}


/*error: toString() in Emp cannot override toString() in Object
         String toString(){
                ^
  attempting to assign weaker access privileges; was public



*/