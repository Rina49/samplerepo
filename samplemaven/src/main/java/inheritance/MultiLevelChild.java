package inheritance;

public class MultiLevelChild extends  MultiLevelParent {

	public void sum(int a,int b)
	{
		System.out.println("Sum is " + (a+b));
	}
	public static void main(String[] args) {
		MultiLevelChild obj = new MultiLevelChild();
		obj.print();
		obj.display();
		obj.sum(5, 3);

	}

}
