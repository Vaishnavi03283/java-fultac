class Emp{
	String name;
	String address;

	Emp(String name, String address){
		this.name = name;
		this.address = address;
	}
	public String toString(){
		return "Name is : "+ name + " address is : "+address;	
	}
	String getName(){
		return name;
	}
}
class Demo{
	public static void main(String[]args){
		Emp e = new Emp("Shubham","Pune");
		Emp e1 = new Emp("Sanket","Satara");

		System.out.println(e);
		System.out.println(e1);

		System.out.println("Emp names :- ");
		System.out.println(e.getName());
		System.out.println(e1.getName());
		
	}
}



/*OUTPUT:-

Name is : Shubham address is : Pune
Name is : Sanket address is : Satara
Emp names :-
Shubham
Sanket





*/