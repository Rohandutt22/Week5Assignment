package com.sapient.week5;

public class Tic extends Thread{
    public void run()
    {
    	
    	tic();
    	
    }
     public void tic () 
    {
	   for(int i=0;i<10;i++) {
		   try {
		   System.out.println("tic");
		   
		   wait();
		   
		   }
		   catch(Exception e)
		   {
			   
		   }
	   }
      
    }
  
}
