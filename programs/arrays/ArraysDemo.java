class ArraysDemo {
	public static void main(String[] args){
		
		//declaration
		int[] a = new int[5];
		
		// value initilization.
		a[0] = 100;
		a[2] = 200;
		a[1] = 300;
		a[3] = 400;
		a[4] = 500;
		a[4] = 350;
		// a[5] = 600; //ArrayIndexOutOfBoundsException
		
		System.out.println(a);
		
		
		//value printing
		System.out.println(a[0]);
		// System.out.println(a[1]);
		// System.out.println(a[2]);
		// System.out.println(a[3]);
		// System.out.println(a[4]);
		

		for(int i = 0; i < a.length ;i++){
			System.out.println(a[i]);
		}

		System.out.println("reverse array");
		for(int i = a.length - 1; i >=0  ; i--){
			System.out.println(a[i]);
		}
		
		String[] names = new String[4];
		names[0] ="Sudhakar";
		names[1] = "venky";
		names[3] = "murali";
		for(String name : names){
			System.out.println(name);
		}
		
		for(int j = 0; j < names.length ; j++){
			System.out.println(names[j]);
		}
		
		int[] marks = {60, 60, 70, 35, 90, 54}; //declaration and initilization
		for(int k = 0; k < marks.length; k++){
			System.out.println(marks[k]);
		}
		
		
		//for each only for arrays and collections
		for(int x: marks){
			System.out.println(x);
		}
		// int[] abc;
		// abc = {34,22};	//CE
		
		
	}
}