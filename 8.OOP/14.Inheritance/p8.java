class University{
	int a = 20;
	
	void syllabus(){
		System.out.println("java Syllabus");
	}
}
class College extends University{
	
	void department(){
		System.out.println("AI");
	}
}
class Demo{
	public static void main(String[]args){
		System.out.println("College Syllabus is : ");
		College obj = new College();
		obj.syllabus();
		obj.department();
		
		System.out.println("University syllabus is : ");
		University obj1 = new University();
		obj1.syllabus();
	}
}


/*
College Syllabus is :
java Syllabus
AI
University syllabus is :
java Syllabus



*/

