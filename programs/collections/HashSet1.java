import java.util.*;
class HashSet1{
		public static void main(String...r){
			int[] val={40,94,32,40,56,32};
			HashSet k=new HashSet();
			for(int a:val){
				k.add(a);
			}
			System.out.println(k.contains(40));
			System.out.println(k.isEmpty());
			System.out.println(k.size());
			Object de=k.clone();
			System.out.println(de);
			List s=new ArrayList();
			s.add(83);
			s.add(84);
			s.add(93);
			s.add(83);
			System.out.println(s);
			k.add(30);
			k.add(43);
			k.add(83);
			System.out.println(k);

}
}