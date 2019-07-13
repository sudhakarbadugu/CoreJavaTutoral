class ArrayBigNumber{
	public static void main(String[] args){
	int[] array = {1, 18, 45, 678, 10};
		int max=array[0];
	for(int a=1;a<array.length;a++){
			if(max<array[a]){
				max=array[a];
			}
			System.out.println(max);
}
	}
}