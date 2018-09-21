class ArrayExample{
	public static void main(String args[]){
	int[] points=new int[5];
	   points[0]=10;
	   points[1]=2;
	   points[2]=64;
	   points[3]=32;
	   points[4]=62;
	   
		for( int i= points.length - 1;i>=0;i--){
			System.out.println(points[i]);
		}
	}

}