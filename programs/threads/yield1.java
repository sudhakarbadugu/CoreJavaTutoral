class yield1{
		public static void main(String...q){
		AbThread j=new AbThread();
			System.out.println("a values");
			
		j.start();
		for(float h=0;h>-10;h--){
				System.out.println(h);
			
		}
}
}
class AbThread extends Thread{
	public void run(){
		
	System.out.println("jungle");
	for(long k=199990;k<200000;k++){
		System.out.println(k);
	}
	}

}