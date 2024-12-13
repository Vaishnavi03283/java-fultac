//Methods in Stack ----->>>>>>>>

import java.util.*;

class Demo{
	public static void main(String[]args){
		Stack ls = new Stack();
		ls.push(10);
		ls.push(20);
		ls.push(30);

		//boolean empty() : this method check whether stack is empty or not
		System.out.println(ls.empty());

		//element pop() : this method removes and return the last element of stack
		ls.pop();
		System.out.println(ls);

		//element peek() : this method returns the the last element of the stack
		System.out.println(ls.peek());
		System.out.println(ls);
	}
}

/*OUTPUT:-

false
[10, 20]
20
[10, 20]


*/