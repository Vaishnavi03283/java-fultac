interface A{
	int a = 10;
}
interface B{
	int a = 20;
}
class Child implements A , B{
	void fun(){
		System.out.println(a);
	}
}
class Demo{
	public static void main(String[]args){
		Child obj = new Child();
		obj.fun();
	}
}


/* error: reference to a is ambiguous
                System.out.println(a);
                                   ^
  both variable a in A and variable a in B match				*/