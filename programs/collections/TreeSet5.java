import java.util.*;
	class TreeSet5{
			public static void main(String[] args){
				TreeSet e=new TreeSet();
				e.add(87);
				e.add(837);
				e.add(65);
				e.add(76);
				// System.out.println(e);
				float[] numbers={27.3f,85.3f,33.3f,27.3f};
					System.out.println(Arrays.toString(numbers));
					System.out.println(numbers[numbers.length-1]);
					// System.out.println(numbers);
					LinkedList g=new LinkedList();
					for(float f:numbers){
						boolean a=g.add(f);
						if(a==false){
							System.out.println(f);
						}
						System.out.println(e);
					}
			}
	
	}