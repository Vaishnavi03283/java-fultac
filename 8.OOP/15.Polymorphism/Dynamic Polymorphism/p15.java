class Parent{
	void education(){
		System.out.println("Engineering");
	}
}
class Child extends Parent{
	int education(){
		System.out.println("Engineering sodun sagla");
	}
}
class Demo{
	public static void main(String[]args){
		Child c = new Child();
		c.education();
	}	
}



/*error: education() in Child cannot override education() in Parent
        int education(){
            ^
  return type int is not compatible with void						*/