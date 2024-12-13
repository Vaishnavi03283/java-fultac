import java.util.*;

class Demo{
	public static void main(String[]args){
		List ls = new Stack();
		ls.push(10);
		System.out.println(ls);
	}
}

/*error: cannot find symbol
                ls.push(10);
                  ^
  symbol:   method push(int)
  location: variable ls of type List

*/