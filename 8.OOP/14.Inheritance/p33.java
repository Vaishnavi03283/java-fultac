class Teacher{
	String name;
	String Address;

	void setName(String name){
		this.name = name;
	} 
	
	void setAddress(String Address){
		this.Address = Address;
	}

	String getName(){
		return name;
	}

	String getAddress(){
		return Address;
	}
}

class Student extends Teacher{
	int roll_no;
	int marks;

	void setRoll_No(int roll_no){
		this.roll_no = roll_no;
	}

	void setMarks(int marks){
		this.marks = marks;
	}

	int getRoll_No(){
		return roll_no;
	}

	int getMarks(){
		 return marks;
	}
}

class Demo{
	public static void main(String[]args){
		Student s = new Student();
		s.setName("vaishnavi");
		s.setAddress("Satara");
		s.setRoll_No(2);
		s.setMarks(98);

		Teacher t = new Teacher();
		t.setName("jadhav");
		t.setAddress("India");


		System.out.println("Student data is :- ");
		System.out.println("Student Roll_No :- "+ s.getRoll_No());
		System.out.println("Student Marks  :- "+ s.getMarks());

		System.out.println("Teacher data is :- ");
		System.out.println("Teacher Name :- "+ t.getName());
		System.out.println("Teacher Address :- "+ t.getAddress());
	
	
	}
}




/*

OUTPUT:-

Student data is :-
Student Roll_No :- 2
Student Marks  :- 98
Teacher data is :-
Teacher Name :- jadhav
Teacher Address :- India






*/












