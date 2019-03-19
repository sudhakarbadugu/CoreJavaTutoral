
// import com.sudhasoft.model;
    // package com.sudhasoft.Test;
    // import com.sudhasoft.Dto;
 // import com.sudhasoft.model;
    public class StockAlertTest{
	public static void main(String[] args){
    StockAlertDto l = new StockAlertDto();
		     l.setId(143785);
			 l.setstockName("google");
             l.setstrategyAction("developer");
		     l.setstrategyName("market analysis");
		     l.setstopLoss(1000);
		     l.settarget1(4800);
		     l.settarget2(6000);
		     l.settarget3(7000);
		     l.settarget4(8000);
		     l.setcurrentPrice(1500);
		     l.setopenPrice(1700);
		     l.setprofitOrLoss(104788); 
			 l.setresult1("success");
			 
			 
			System.out.println(l.getId());
			
		    System.out.println(l.getstockName());
            System.out.println(l.getstrategyAction());
		    System.out.println(l.getstrategyName());
		    System.out.println(l.getstopLoss());
		    System.out.println(l.gettarget1());
		    System.out.println(l.gettarget2());
		    System.out.println(l.gettarget3());
		    System.out.println(l.gettarget4());
		    System.out.println(l.getcurrentPrice());
		    System.out.println(l.getopenPrice());
		    System.out.println(l.getprofitOrLoss()); 
			System.out.println(l.getresult1());
			 System.out.println(l);
		
			
	}
}