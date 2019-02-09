import java.util.*;
	class TreeSet1{
		public static void main(String...a){
		int arr[]={90,78,84,78,123,98};
		System.out.println(Arrays.toString(arr));
		// System.out.println(arr);
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[0]);
		System.out.println(arr[arr.length-1]);
		}
	}