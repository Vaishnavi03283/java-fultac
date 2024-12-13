class Emp{
	int a = 20;
}

class Codex{

	static Object fun(){
		return new Emp();
	}
}
class Demo{
	public static void main(String[]args){
		Emp s =Codex.fun();
		System.out.println(s);
	}
}

/*error: incompatible types: Object cannot be converted to Emp
                Emp s =Codex.fun();
                                ^
*/