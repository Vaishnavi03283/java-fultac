class Person{
	
	void fun(){
		System.out.println("in fun");
	}
}

class Demo{
	public static void main(String [] args){
		Person p = new Person();
		System.out.println(p.fun());
	}
}

/*
error: 'void' type not allowed here
                System.out.println(p.fun());
                                        ^

In sop - we can call those methods which has return type

Here void has No return type

*/