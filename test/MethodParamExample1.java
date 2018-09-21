class MethodParamExample1{
        public static void main(String args[]){
			int a=10;
			int b=6;
			
			MethodParamExample1 m=new MethodParamExample1();
			m.add(a,b);
			m.sub(a,b);
			m.mul(a,b);
		}
		public void add(int a,int b){
			System.out.println(a+b);
		}
		public void sub(float a,float b){
			System.out.println(a-b);
		}
		public void mul(byte a,int b){
			System.out.println(a*b);
		}
}