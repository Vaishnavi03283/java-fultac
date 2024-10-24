class Demo{
	public static void main(String [] args){
		Codex chavi = new Codex();
		chavi.fan();
	}
}


class Codex{
	
	//instance Variable 
	int chairs;

	//action method
	void fan(){
		int a = 10 ;    //local variable
		System.out.println("fan is started : " + a);
		System.out.println("fan is started : " + chairs);

	}
}


/*
OUTPUT:-

fan is started : 10
fan is started : 0

*/