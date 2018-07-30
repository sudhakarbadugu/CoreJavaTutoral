class ArraysDemo {
	public static void main(String[] args){
		
		//declaration
		byte[] a = new byte[5];
		
		// value initilization.
		a[0] = 1;//"s";//ce
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		//a[5] = 5; Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
        //at ArraysDemo.main(ArraysDemo.java:12)
		
		System.out.println(a);
		
		
		//value printing
		System.out.println(a[0]);
		System.out.println(a[4]);
		
		for(int i = 0; i< a.length ; i++){
			System.out.println(a[i]);
		}
		
		String[] names = new String[4];
		names[0] ="Sudhakar";
		names[1] = "venky";
		names[3] = "murali";
		
		for(int j = 0; j < names.length ; j++){
			System.out.println(names[j]);
		}
	}
}