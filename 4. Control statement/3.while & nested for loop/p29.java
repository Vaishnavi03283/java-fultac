class Demo{
	public static void main(String [] args){
		for(int i=1;i<=4;i++){
			int a=1;
			char ch='A';
			for(int j=4;j>=1;j--){
				if(i<j){
					System.out.print(" ");
				}else if(i%2==0){
					System.out.print(a+" ");
					a++;
				}else{
					System.out.print(ch+" ");
					ch++;
				}
			}
				System.out.println();
		}
	}
}

    A
  1 2
 A B C
1 2 3 4


