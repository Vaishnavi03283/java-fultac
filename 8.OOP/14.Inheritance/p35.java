/* Types of Inheritance:-

1.Single Inheritance -- sub-classes(Child) from single super class(Parent)
2.Multi-level Inheritance. -- Object >> Teacher >> Student
3.Multiple Inheritance.  -- Not support in >> Java >> but,it can achieved by using >> 'Interface Concept'.       */

//Multiple Inheritance


class Father{

}

class Mother{

}

class Child extends Father,Mother{

}

class Demo{
	public static void main(String[]args){
		Child c = new Child();
	}
}


/*error: '{' expected
class Child extends Father,Mother{
                          ^
*/








