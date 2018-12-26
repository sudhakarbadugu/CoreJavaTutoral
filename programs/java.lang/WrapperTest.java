public class WrapperTest {
	public static void main(String... arg){
		WrapperTest.stringToNumber();
		
		// int i = 20;
		int i1 = 25;
		
		//convert number to string
		Integer i = 26;
		String is = i.toString();
		System.out.println(is.contains("5"));
		
		//convert one datatype to another xxValue
		byte b = i.byteValue();
		
		Integer ig = Integer.valueOf(i);
		System.out.println(ig);
		
		Boolean b12 = Boolean.parseBoolean("TRUE");
		System.out.print(b12);
		
	}
	
	private static void stringToNumber(){
		int i = 20;
		Integer i1 = 20;
		Integer i2 = new Integer(130);
		Integer i3 = 130;
		
		System.out.println(i2 == i3);
		System.out.println(i2.equals(i3));
		
		String s = "10";
		String s1 = "20";
		
		//
		Integer i4 = new Integer(s);
		Integer i5 = new Integer(s);
		
		//alwasys recomened to use parseInt
		int i6 = Integer.parseInt(s);
		int i7 = Integer.parseInt(s1);
		
		System.out.println(i4 + i5);
		System.out.println(i5 + i6);
		
		String s2 = "10.23";
		// Double d = new Double(s2);
		Double d = Double.parseDouble(s2);
		int val = d.intValue();
		System.out.println(d+10);
	}
}


//how to convert strig to integer