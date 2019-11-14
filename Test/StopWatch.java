package Test;

public class StopWatch extends Thread {
	
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		
		StopWatch s=new StopWatch();
		StopWatch s1=new StopWatch();
		
		s.start();
		
		try
		{
			s.join(1000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		s1.start();
	}
}
