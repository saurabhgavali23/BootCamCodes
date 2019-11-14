package Test;

public class StringOccurance {

	public static void main(String[] args) {
		
		String str="HelLo".toUpperCase();
		int count=0;
		char ch,c;
		for(int i=0;i<str.length();i++)
		{
			 ch=str.charAt(i);
			
			for(int j=0;j<str.length();j++)
			{
				 c=str.charAt(j);
				
				if(i!=j && ch==c)
				{
					System.out.print(c+" ");
					count++;
				}
			}
		}
		System.out.println();
		System.out.println("count "+count);
		
	}
}
