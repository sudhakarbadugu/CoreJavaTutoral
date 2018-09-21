class ArraysSortDemo {
	public static void main(String[] args){
		
		//declaration
		int[] numbers = {1,4,2,390,100, 200};
		for(int i = 0; i < numbers.length; i++){
			for(int j = 0; j< numbers.length; j++){
				if(numbers[i] < numbers[j]){
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}				
		}
		
		for(int a : numbers){
			System.out.println(a);
		}
	}
}