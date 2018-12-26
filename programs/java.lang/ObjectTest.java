public class ObjectTest {
	public static void main(String... arg){
		String s = "Test";
		String s1 = new String("test");
		String s2 = "Test";
		
		System.out.println(s1 == s);	//false
		// System.out.println(s == s2);
		System.out.println(s1.equals(s));	//true
		
		StringBuffer sb1 = new StringBuffer("Sudha");
		StringBuffer sb2 = new StringBuffer("Sudha");
		System.out.println(sb1 == sb2);	//false
		System.out.println(sb1.equals(sb2));	//false
	}
}

