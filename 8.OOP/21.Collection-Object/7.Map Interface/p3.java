//HashMap----->>>>>>

import java.util.*;

class Demo{
	public static void main(String[]args){
		HashMap<String,String>hm = new HashMap<String,String>();
		hm.put("viraj","koli");
		hm.put("rohit","verma");
		hm.put("rohit","sharma");
		
		System.out.println("All Keys : ");
		for(String s : hm.keySet()){
			System.out.println(s);
		}
		
		System.out.println("All Values : ");
		for(String s : hm.values()){
			System.out.println(s);
		}

		System.out.println("All Keys and Values : ");
		for(Map.Entry<String,String>Entry : hm.entrySet()){
			System.out.println("Key is :  "+ Entry.getKey()+" Value is :  "+ Entry.getValue());
		}
	}
}


/*OUTPUT:- 


All Keys :
viraj
rohit
All Values :
koli
sharma
All Keys and Values :
Key is :  viraj Value is :  koli
Key is :  rohit Value is :  sharma




*/