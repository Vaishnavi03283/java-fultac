class One{
	int x;
	Two t;

	One(Two t){
		this.t = t;
		x = 10;
	}
	void display(){
		System.out.println("Ones x  : "+ x);
		t.display();
		System.out.println("Twos var y : "+ t.y);
	}
}

class Two{
	int y;
	Three t1;
	
	Two(Three t1){
		this.t1 = t1;
		y = 20;
	}
	void display(){
		System.out.println("Twos y : "+ y);
		t1.display();
		System.out.println("Threes var y : "+ t1.z);
	}
}

class Three{
	int z;
	
	Three(int z){
		this.z = z;
	}
	void display(){
		System.out.println("Threes z : "+ z);
	}
}

class Demo{
	public static void main(String [] args){
		Three obj3 = new Three(55);
		Two obj2 = new Two(obj3);
		One obj1 = new One(obj2);
		obj1.display();
		obj2.display();
	
	}
}

/*

OUTPUT:-

Ones x  : 10
Twos y : 20
Threes z : 55
Threes var y : 55
Twos var y : 20
Twos y : 20
Threes z : 55
Threes var y : 55


*/