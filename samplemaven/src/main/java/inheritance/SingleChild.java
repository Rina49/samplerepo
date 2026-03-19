package inheritance;

public class SingleChild extends SingleParent{

	public void call()
    {
    	System.out.println("Calling Child..");
    }
    
	public static void main(String[] args) {
	    
        SingleChild obj = new SingleChild();
        obj.display();
        obj.call();
	}

}
