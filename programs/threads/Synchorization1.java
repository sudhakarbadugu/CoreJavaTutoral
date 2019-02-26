class Synchorization1{
			public static void main(String[] args){
				PrintText k=new PrintText();
				HaiThread t=new HaiThread(k);
				t.start();
				for(int i=0;i<5;i++){
					k.printName("prasad");
					 System.out.println(i);
				}
			}
}
class HaiThread extends Thread{
	private PrintText k;
	  HaiThread(PrintText k){
		  this.k=k;
	  }
	
	public void run(){
		Thread j = Thread.currentThread();
		for(int i=3;i<=8;i++){
			k.printName("murali");
			// System.out.println(i);
		}
		
	}
}
class PrintText{
	public void printName(String name){
		synchronized(this){
			System.out.println("kslsdk");
		
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				
			}
			System.out.println(name);
		}
	}
}