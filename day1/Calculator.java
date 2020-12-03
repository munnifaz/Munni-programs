package week4.day1;

public class Calculator {

		public void add(int a, int b) {
			System.out.println("The sum is"+" "+(a+b));}
		
		public void add(int a, int b,int c){
			System.out.println("The sum is"+" "+(a+b+c));}
		
		public void multiply(int a,int b) {
			System.out.println("The multiplication of two integers"+" "+(a*b));}
			
		public void multiply(int a, double b)	{
			System.out.println("The multiplication of int and double is"+" "+(a*b));}
		
		public void subtract(int a , int b) {
			System.out.println("subtract two integers are"+" "+(a-b));}
		
		public void subtract(double a , double b) {
			System.out.println("subtract two double args"+" "+(a-b));}
		
		public void divide(int a, int b) {
			System.out.println("dividing two integers"+" "+(a/b));}
			
		public void divide(int a,double b) {
			System.out.println("dividing one integer and one double"+" "+(a/b));}
			
			
		public static void main(String[] args)	{
			Calculator c=new Calculator();
			c.add(1, 2);
			c.add(1, 2, 3);
			c.multiply(2, 3);
			c.multiply(2, 2.0);
			c.subtract(4, 2);
			c.subtract(2.0, 4.0);
			c.divide(8, 2);
			c.divide(2, 4.5);
			

	}

}
