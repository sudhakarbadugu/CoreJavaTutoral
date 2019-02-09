import java.util.concurrent.*;
class ArrayBlockingQueueDemo {
	public static void main(String[] args){
		ArrayBlockingQueue ab = new ArrayBlockingQueue(100);
		ab.add("Sudha");
		ab.add("Sudhakar");
		ab.add(2);
		ab.add(23);
		//ab.add(null);
		
		System.out.println(ab.peek());
		System.out.println(ab);
		
		System.out.println(ab.poll());
		System.out.println(ab.poll());
		System.out.println(ab);
		
	}
 }