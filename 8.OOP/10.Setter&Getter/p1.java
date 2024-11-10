class Codex{
	int age;

	//setter or mutable method
	void setAge(int age){
		this.age = age;
	}
	
	//getter or accessor method
	int getAge(){
		return age;
	}
}

class Demo{
	public static void main(String [] args){
		Codex obj = new Codex();
		obj.setAge(20);
		int a = obj.getAge();
		System.out.println(a);
	}
}


//OUTPUT:-  20