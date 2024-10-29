//parameterized Constructor is useful to initialiized each object with different data


class Person{
	int age;
	String name ;
		
	Person(int a , String str){
		age = a ;
		name = str;
	}

}

class Demo{
	public static void main(String [] args){
		Person p = new Person(21,"Ram");
		Person p1 = new Person(20,"Sita");
	}
}