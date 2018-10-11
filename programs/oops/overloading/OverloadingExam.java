class OverloadingExam{
	public static void main(String[] args){
	OverloadingExam object=new OverloadingExam();

	object.b1(88,22.7f);
	}
	public void b1(int a,float b){
	System.out.println("as");
	}
	public void b1(float b,int a){
	System.out.println("g");
	}

}