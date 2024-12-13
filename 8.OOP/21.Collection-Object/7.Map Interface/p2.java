//HashMap----->>>>>>

import java.util.*;

class Demo{
	public static void main(String[]args){
		HashMap<String,String>hm = new HashMap<String,String>();
		hm.put("viraj","koli");
		hm.put("rohit","verma");
		hm.put("rohit","sharma");

		System.out.println(hm);
	}
}


//OUTPUT:- {viraj=koli, rohit=sharma}