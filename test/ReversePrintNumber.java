class ReversePrintNumber{
	public static void main(String...q){
	
	for(int i=21;i>=10;i--){
		System.out.println(i);
		for(int j:ReversePrintNumber){
			System.out.println(j);
		}
	}
	}
}