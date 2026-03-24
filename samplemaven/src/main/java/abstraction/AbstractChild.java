package abstraction;

public class AbstractChild extends AbstractParent {

	public static void main(String[] args) {
		AbstractChild obj = new AbstractChild();
		obj.display();
		obj.print();
		obj.sum();

	}

	@Override
	public void display() {
		System.out.println("Display method");
		
	}

	@Override
	public void print() {
		System.out.println("Print method");
		
	}

}
