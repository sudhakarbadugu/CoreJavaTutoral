class ArraysFloatExample{
	public static void main(String args[])
	{
	float[] test=new float[10];
		test[0]=7.90f;
		test[1]=5.09f;
		test[2]=8.4f;
		test[3]=3.4f;
		test[4]=0.898f;
		test[5]=3.898f;
		test[6]=78.9f;
		test[7]=73.4f;
		test[8]=45.7f;
		test[9]=87.4f;
		//test[10]=7.4f;
		System.out.println(test);
		for(int i=0;i<test.length;i++){
			System.out.println(test[i]);
		}
	}
}