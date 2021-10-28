package clock;

public class Clock {
    private Display minute=new Display(60);
    private Display hour=new Display(24);
    
    public void start() {   
         for(;;)
    	{
    	minute.increase();
    		if(minute.getValue()==0)
    		{
    		hour.increase();
    		}
    	System.out.printf("%02d:%02d\n",hour.getValue(),minute.getValue());
    	}
     
        	
    }
      
    	
    
	
    public static void main(String[] args) {
		// TODO Auto-generated method stub
           Clock time = new Clock();
           time.start();
	}

}
