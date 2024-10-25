class Demo{
	public static void main(String [] args){
		Codex chavi = new Codex();
		chavi.fan();
	}
}


class Codex{
	
	//instance Variable 
	int chairs;
	String name;
	char ch;
	float f;
	double d;

	//action method
	void fan(){
		int a = 10 ;    //local variable
		System.out.println("fan is started : " + a);
		System.out.println("fan is started : " + chairs);
		System.out.println("fan is started : " + name);
		System.out.println("fan is started : " + ch);
		System.out.println("fan is started : " + f);
		System.out.println("fan is started : " + d);
	}
}



/*OUTPUT:-

fan is started : 10
fan is started : 0
fan is started : null
fan is started :
fan is started : 0.0
fan is started : 0.0

*/