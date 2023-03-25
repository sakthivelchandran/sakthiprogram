package org.com;

public class TestPalindrome {
//Q 53. Palindrome
	
	public void wordCheck(String str) {
		boolean ans = false;
		String result ="";
		for(int i=str.length()-1;i>=0;i--) {
			char c = str.charAt(i);
			result = result + c;
		}
		if (str.equals(result)) {
			System.out.println(str +" is palindrome String");
		}else {
			System.out.println(str +" is not palindrome String");
		}
		
	}
	
	public void numberCheck(int n) {
		int num=n;
		int reverse=0,rem=0;
		while(n!=0) {
			rem = n%10;
			reverse = reverse*10+rem;
			n =n/10;
		}

		if(num==reverse) {
			System.out.println(num +" is palindrome number");
		}else {
			System.out.println(num +" is not palindrome String");
		}
	}
	
	public static void main(String[] args) {
		TestPalindrome tp = new TestPalindrome();
		String word ="madam";
        tp.wordCheck(word);
		
		
		int i=103;
		tp.numberCheck(i);
		
	}
}
