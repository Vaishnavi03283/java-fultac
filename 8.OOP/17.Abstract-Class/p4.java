abstract class Parent{
	abstract void education();
}
class Demo{
	public static void main(String[]args){
		Parent obj = new Parent();
		obj.education();
	}
}


/*error: Parent is abstract; cannot be instantiated
                Parent obj = new Parent();
                             ^								*/