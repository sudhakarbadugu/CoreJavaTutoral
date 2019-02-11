import java.util.concurrent.*;
	class ArrayBlockingQueue1{
		public static void main(String[] args){
			ArrayBlockingQueue k=new ArrayBlockingQueue(3);
			k.add(190);
			k.add(54.3f);
			k.add(23);
			// k.add(90);
			System.out.println(k);
			System.out.println(k.peek());
			System.out.println(k.poll());
			System.out.println(k.remove(190));
		}
	
	}