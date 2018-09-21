class ArraySortDecending{
	public static void main(String[]args){
	int[]number={89,65,75,90,23,36,74,43};
	 for(int i=0;i<number.length;i++){
	 for(int j=0;j<number.length;j++){
	 if(number[i]>number[j]){
	int temp=number[i];
	    number[i]=number[j];
	    number[j]=temp;
	}
}
}
	
	for(int a:number)
		System.out.println(a);
		
	}
}
