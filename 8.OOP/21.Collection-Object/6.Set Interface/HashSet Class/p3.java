//Hashset Class ----->>>>

import java.util.*;

class Student{
	String name;

	Student(String name){
		this.name = name;
	}
	@Override
	public String toString(){
		return"Student name is : "+ name ;
	}
}

class Demo{
	public static void main(String[]args){
		HashSet<String> hs = new HashSet<String>();
		hs.add(new String("Viraj"));
		hs.add(new String("gumrah"));
		hs.add(new String("rohit"));
		hs.add(new String("Ms"));
	
		Iterator itr = hs.iterator();
		while(itr.hasNext()){
			Student s = (Student)itr.next();
			System.out.println(s);
			System.out.println(s.name);
		}
	}
}

/*

Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class Student (java.lang.String is in module java.base of loader 'bootstrap'; Student is in unnamed module of loader 'app')
        at Demo.main


*/
