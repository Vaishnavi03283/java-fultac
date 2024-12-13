//equals method in HashSet class ---->>>>

import java.util.*;

class Emp{
	String name;

	Emp(String name){
		this.name = name;
	}
	public boolean equals(Object obj){
		Emp e = (Emp)obj;
		
		if(this.name == name){
			return true;
		}else{
			return false;
		}
	}
	public int HashCode(){
		return 1;
	}
}
class Demo{
	public static void main(String[]args){
		HashSet<Emp>hs = new HashSet<Emp>();
		hs.add(new Emp("viraj"));
		hs.add(new Emp("koli"));

		System.out.println(hs);
	}
}



//OUTPUT :- [Emp@2f92e0f4, Emp@28a418fc]