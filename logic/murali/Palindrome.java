class Palindrome{
	public static void main(String[] args){
	int a,sum=0,temp;
	int f=323;
	temp =f;
	while(f>0){
		a=f/10;
		sum=(sum*10)+f;
		f=f/10;
		if(temp==sum){
			System.out.println("palindrome");
		}else{
			System.out.println("palindrome or not");
		}
	}
	}

}