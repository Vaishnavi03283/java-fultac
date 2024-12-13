class Emp{
	void fun(){
		System.out.println("in fun");
	}
}
class Dev extends Emp{
	void code(){
		System.out.println("coding");
	}
}
class Manager extends Emp{
	void manage(){
		System.out.println("manage");
	}
}
class HR extends Emp{
	void rangoli(){
		System.out.println("useless");
	}
}
class Codex{
	void display(Emp obj){
		Manager m = (Manager)obj;
		m.fun();
		m.manage();

		//Dev d = (Dev)obj;
		//d.fun();
		//d.manage();
	}
}
class Demo{
	public static void main(String[]args){
		Dev d = new Dev();
		Manager m = new Manager();
		Codex obj = new Codex( );
		obj.display(m);
		//obj.display(d);
	}
}




/*
OUTPUT:-in fun
	manage





*/