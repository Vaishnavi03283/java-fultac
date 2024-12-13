//int get position(int position)------------

import java.util.*;

class Emp{
	String empName;
	int salary;

	Emp(String empName, int salary){
		this.empName = empName;
		this.salary = salary;
	}
	public String toString(){
		return"Emp name is : "+empName+"and salary is : "+ salary;
	}
	String getEmpName(){
		return empName;
	}
	int getSalary(){
		return salary;
	}
}
class Demo{
	public static void main(String[]args){
		LinkedList<Emp>ls = new LinkedList<Emp>();
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++){
			System.out.println("Enter Emp name : ");
			String empName = sc.next();
			System.out.println("Enter Emp salary : ");
			int salary = sc.nextInt();

			ls.add(new Emp(empName, salary));
		}
	
		Iterator itr = ls.iterator();
		System.out.println("All Emps : ");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("Enter Emp position : ");
		int position = sc.nextInt();
		System.out.println("Emp of specified position : ");
		System.out.println(ls.get(position));

		Emp e = ls.get(position);
		System.out.println(e.getEmpName());
		System.out.println(e.getSalary());
	}
}


/*OUTPUT: 

Enter Emp name :
Vaishnavi
Enter Emp salary :
1000
Enter Emp name :
sai
Enter Emp salary :
2000
Enter Emp name :
Snehal
Enter Emp salary :
3000
All Emps :
Emp name is : Vaishnaviand salary is : 1000
Emp name is : saiand salary is : 2000
Emp name is : Snehaland salary is : 3000
Enter Emp position :
2
Emp of specified position :
Emp name is : Snehaland salary is : 3000
Snehal
3000



*/




