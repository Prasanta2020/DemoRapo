package TestCases;
//method and constructor 
//for Demo testing
public class Demo1 {

	public void abc(){
	System.out.println("Display");
		}
	Demo1()
	{
		System.out.println("Parent Cons");
	
	}
	
	public void Demo1() {
		
	}
	public class Demo2 extends Demo1{
	public void abc(int i) {
		System.out.println(i);
	}
}
	
	public static void main(String [] args) {
		Demo2 ab = new Demo1();
		Demo1 ac = new Demo2();
		
		
	}
}
