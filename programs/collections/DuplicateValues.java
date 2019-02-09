import java. util.*;
class DuplicateValues{
		public static void main(String[] args){
		int[] value={83,94,89,94,109,83,90};
				for(int i=0;i<value.length-1;i++){
				
				for(int j=i+1;j<value.length-1;j++){
				if(value[i]==value[j])
				
				System.out.println("duplicate:"+value[j]);
				}
		}
}
}