import java.util.*;
class TreeSet3{
		public static void main(String[] args){
		TreeSet s=new TreeSet();
			s.add("vas");
			s.add("das");
			s.add("mas");
			System.out.println(s);
			int[] arr={73,72,71,70,69};
				System.out.println(Arrays.toString(arr));
				System.out.println(arr);
				System.out.println(arr[arr.length-1]);
				LinkedHashSet d=new LinkedHashSet();
				for(int t:arr){
					boolean isAdded=d.add(t);
					if(isAdded==false){
					System.out.println("duplicate"+t);
				}
				System.out.println(s);
		}
}
}
