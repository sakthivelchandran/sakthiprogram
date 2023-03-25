package org.com;

public class ReverseString {

	//Q2. Reverse String Program
  
	public String reverseWord(String str) {
		String result ="";
		for(int i=str.length()-1;i>=0;i--) {
			char c = str.charAt(i);
			result = result + c;
		}
		return result;
	}
	
	public static void main(String[] args) {
		ReverseString rs = new ReverseString();
		System.out.println(rs.reverseWord("Sample Test"));
	}
}
