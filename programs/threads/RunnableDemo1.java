class RunnableDemo1{
		public static void main(String...a){
			NumThread kj=new NumThread();
			Thread o=new Thread(kj);
			o.start();
			for(float e=0;e<-10;e--){
				System.out.println(e);
			}
		}

}
class NumThread implements Runnable{
	
	public void run(){
	System.out.println("hi");
	for(int j=0;j<10;j++){
		 System.out.println(j);
	}
	}
}
