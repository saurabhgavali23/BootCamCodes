package Test;

public class AddElementInArrayByPos {

	public static void main(String[] args) {
		
		int arr[]= {4,5,2,9,3};
		
		int pos=3;
		int n=77;
		System.out.println(arr.length);
		for(int i=arr.length-1;i>pos;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[pos]=n;
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
