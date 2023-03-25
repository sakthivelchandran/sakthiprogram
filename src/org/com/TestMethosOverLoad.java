package org.com;

public class TestMethosOverLoad {
//Q7. Method overloading by changing data types
	
	public void sampleMethod(int x) {
		
		System.out.println("x value is : "+ x);
	}
	public void sampleMethod(int x,int y) {
	int sum =x+y;
		System.out.println("sum of x and y is : "+ sum);
	}
	
	public static void main(String[] args) {
		TestMethosOverLoad obj = new TestMethosOverLoad();
		obj.sampleMethod(5);
		obj.sampleMethod(5, 10);
	}
}
