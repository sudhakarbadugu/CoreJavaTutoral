class ArrayInitByteExample{
	public static void main(String args[]){
		Byte[] value=new Byte[5];
		value[0]=1;
		value[1]=2;
		value[2]=3;
		value[3]=5;
		value[4]=85;
		for(int i=0;i<value.length;i++){
			System.out.println(value[i]);
		}
		Byte[] sample={89,76};
		for( Byte e:sample){
		System.out.println(e);
		}
	}
}
