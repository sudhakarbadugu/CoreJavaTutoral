class Join1{

		public static void main(String...q){
		AbThread jb=new AbThread();
			System.out.println("a values");
				jb.start();
				try{
				jb.join();
				}
				catch(Exception s){
					
				}
				
		for(float h=0;h>-10;h--){
				System.out.println(h);
			
		}
}
}
class AbThread extends Thread{
	public void run(){
	
	System.out.println("jungle");
	try{
	Thread.sleep(2000);
	}
	catch(Exception e){}
	for(long k=256;k<360;k++){
		System.out.println(k);
	}
	}

}