abstract class Parent{
	abstract void education();
}
class Child extends Parent{

}
class Demo{
	public static void main(String[]args){
		Child obj = new Child();
		obj.education();
	}
}


/* error: Child is not abstract and does not override abstract method education() in Parent
class Child extends Parent{
^
*/