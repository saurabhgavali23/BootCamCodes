package Test;

public class ArrayUnion {
	
	public static void main(String[] args) {
		
		int arr[]= {15,6,7,4,8,9};
		int arr1[]= {6,2,5,8,1,3,4};
		int arr3[]=new int[arr.length+arr1.length];
		int len=arr3.length;
		int p=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				if(arr[i]!=arr1[j])
				{
					arr3[p]=arr[i];
				}
				else
				{
					arr[p]=0;
					break;
				}
			}
		//	System.out.print(arr[p]+" ");
			p++;
		}
		
		while(len!=p)
		{
			for(int k=0;k<arr1.length;k++)
			{
				arr3[p]=arr1[k];
			p++;
			}
		//	System.out.print(arr3[p]+" ");
		}
		
		for(int h=0;h<arr3.length;h++)
			System.out.print(arr3[h]+" ");
	}

}
