import java.util.*;
class TreeSetExam{
	public static void main(String...a){
		TreeSet t=new TreeSet();
	
		t.add("jessy");  
		t.add("vinod");
		t.add("bharath");
		t.add("suresh");
		t.add("vamsi");
		System.out.println(t);
	int[] arr={50,70,56,32,70,50};
			System.out.println(Arrays.toString(arr));
			System.out.println(arr);
			System.out.println(arr[arr.length-1]);
		LinkedHashSet k=new LinkedHashSet();
			for(int b:arr){
				boolean isAdded=k.add(b);
				if(isAdded==false){
					System.out.println("duplicate"+ b);
				}
			}
			System.out.println(t);
	}
}