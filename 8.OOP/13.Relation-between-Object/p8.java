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
	Four t2;
	
	Three(Four t2){
		this.t2 = t2;
		z = 100;
	}
	void display(){
		System.out.println("Threes z : "+ z);
		t2.display();
		System.out.println("Fours var w : "+ t2.w);
	}
}

class Four{
	int w;

	Four(int w){
		this.w = w;
	}
	void display(){
		System.out.println("Fours w : "+ w);
	}
}

class Demo{
	public static void main(String [] args){
		Four obj4 = new Four(99);
		Three obj3 = new Three(obj4);
		Two obj2 = new Two(obj3);
		One obj1 = new One(obj2);
		obj1.display();
		
		
	}
}

/*

OUTPUT:-

Ones x  : 10
Twos y : 20
Threes z : 100
Fours w : 99
Fours var w : 99
Threes var y : 100
Twos var y : 20


*/