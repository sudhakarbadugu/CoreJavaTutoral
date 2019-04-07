class Arrays2Demo {
	public static void main(String[] args){
		
		//declaration
		int[][] a = new int[5][2];
		
		a[0] = new int[5];
		a[4] = new int[5];
		
		
		a[0][0] = 1;
		a[0][1] = 10;
		
		a[1][0] = 2;
		a[1][1] = 20;
		
		
		a[4][0] = 40;
		a[4][1] = 400;
		

		for(int i = 0; i < a.length ; i++){
			for(int j=0; j<a[i].length; j++){
				System.out.println(a[i][j]);
			}
		}
		
		
		int[][][] ab = new int[5][2][2];
		
		
		ab[0][0][0] = 100;
		ab[0][1][1] = 10000;
		
		ab[1][0][0] = 200;
		ab[1][1][1] = 2000;
		
		
		ab[4][0][0] = 400;
		ab[4][1][1] = 4000;
		

		for(int i = 0; i < ab.length ; i++){
			for(int j=0; j<ab[i].length; j++){
				for(int k=0; k<ab[i][j].length; k++){
					System.out.println(ab[i][j][k]);
				}
			}
		}
	}
}