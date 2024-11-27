class Parent{
	void education(){
		System.out.println("Engineering");
	}
}
class Child extends Parent{

	void flat(){
		System.out.println("Pune");
	}
}
class Demo{
	public static void main(String[]args){
		Parent p = new Child();
		p.education();
		p.flat();
	}
}


/* error: cannot find symbol
                p.flat();
                 ^									*/