package com.sapient.week5;

public class Tac extends Thread{

	 public void run()
	    {
  tac();
	    }
	 synchronized public void tac()
	 {
		 for(int i=0;i<10;i++)
		    	{
			 try {
				
				   System.out.println("tac");
				   notify();
				  
				   }
				   catch(Exception e)
				   {
					   
				   }
		    	}
	 }
}
