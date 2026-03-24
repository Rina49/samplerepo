package encapsulation;

public class Student {
	private String name;
	private int rollno;
	
	public void getter() {
		System.out.println("NAME: " + name);
		System.out.println("Roll no : " + rollno);
	}

	public void setter(String name,int rollno) {
		
		this.name=name;
		this.rollno=rollno;
	}
}

