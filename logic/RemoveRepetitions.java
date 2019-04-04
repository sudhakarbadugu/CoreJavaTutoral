public class RemoveRepetitions{ 
		 public static  String transform(String input){
			if(input==null)
				return"";
			
			StringBuilder s=new StringBuilder();
			for(int i=0;i<input.length();i++){
				char ch=input.charAt(i);
				if(s.length()==0||s.charAt(s.length()-1)!=ch) {
					s.append(ch);	
				}
				
			}
			
			return s.toString();
		}
		
		public static void main(String[] args){
			String output = transform("karuuuuru");
			System.out.println(output);
		}
}