package Test;

import java.util.Arrays;

public class StringAnagram {
	
	public static void main(String[] args) {
		
		String str="keep";
		String str2="peek";
		
		char a[]=str.toCharArray();
		char b[]=str2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		boolean s=Arrays.equals(a, b);
		if(s)
			System.out.println("it is anagram");
		else
			System.out.println("it is not anagram");
		
	}
	

}
