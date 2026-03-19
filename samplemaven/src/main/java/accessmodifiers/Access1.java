package accessmodifiers;

public class Access1 {

	public void display1()
	{
		System.out.println("Public access modifier");
	}
	private void display2()
	{
		System.out.println(" Private access modifier");
	}
	protected void display3()
	{
		System.out.println("Protected access modifier");
	}
	void displaydefault()
	{
		System.out.println("default access modifier");
	}
	public static void main(String[] args) {
	       
     Access1 obj = new Access1();
     obj.display1();
     obj.display2();
     obj.display3();
     obj.displaydefault();
     
	}

}
