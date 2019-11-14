package Test;

public class Armstrong {

	public static void main(String[] args) {
		
		int n=9474,r;
		int sum=0;
		int temp=n;
		int count=0;
		
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		
		n=temp;
		//System.out.println(n);
		while(n!=0)
		{
			//System.out.println(n);
			r=n%10;
			sum=sum+(int)Math.pow(r, count);
			n=n/10;
		}
		
		if(temp==sum)
			System.out.println("Armstrong"+" "+sum);
		else
			System.out.println("not Armstrong");
	}
	
}
