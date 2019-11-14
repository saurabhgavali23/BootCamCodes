package Test;

public class InsertionSort {

	public static void insertionSort(int arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
			int key=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}		
	}
	
	public static void main(String[] args) {
		
		int arr[]= {4,6,8,2,7,3};
		
		insertionSort(arr);
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
}
