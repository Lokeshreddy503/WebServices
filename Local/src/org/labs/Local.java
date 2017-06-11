package org.labs;



class Local
{ /*
	 static
	 {
		 System.out.println("iam parent class staic block");
	 }*/
	 {
			System.out.println("iam parent class instance block");
	 }
	 public Local() 
	 {
		 System.out.println("iam Parent class Constructor"); 
		
	 }
}
class Child extends Local
{
	{
		System.out.println("iam child class instance block");
	}
	Child()
	{
		//Local();
		System.out.println("iam Child class Constructor"); 
	}
	Child(int a)
	{
		//Local();
		System.out.println("iam Child class 1-arg Constructor");
	}
	Child(int a,int b)
	{
		//Local()
		System.out.println("iam Child class 2-arg Constructor");
	}
	public static void main(String[] args) 
	{
		Child child = new Child();
		Child child2 = new Child(10);
		Child child3 = new Child(10,20);
		
		
	}
}


