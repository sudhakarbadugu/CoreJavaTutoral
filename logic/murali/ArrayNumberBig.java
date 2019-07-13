class ArrayNumberBig{
	public static void main(String[] args){
	int arr={67,76,895,637,32};
	System.out.println(Arrays.toString(arr));
	sort(arr);
	System.out.println(arr[arr.length-1]);
	}
private static void sort(int[] arr){
	for(int o=0;o<length-1;o++){
		for(int k=o+1;k<length-1;k++){
			if(arr[k]>arr[o]){
				int temp=arr[o];
				arr[o]=arr[k];
				arr[k]=temp;
			}
		}
	}
	
}

}
	
