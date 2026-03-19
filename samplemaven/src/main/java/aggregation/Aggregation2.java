package aggregation;

public class Aggregation2 {
	String city;
	String state;
	Aggregation1 ref;
 public Aggregation2(String city,String state,Aggregation1 ref) {
	 this.city=city;
	 this.state=state;
	 this.ref=ref;
 }
 public void display() {
	 System.out.println("Name: " +ref.name + " Roll no : " +ref.rollno + " Address : " +ref.address);
	 System.out.println("city : "+city +" and state " +state);
 }
 
 
 public static void main(String args[])
 {
	 Aggregation1 obj1 = new Aggregation1("Rina",21,"ABC STREET");
	 Aggregation2 obj = new Aggregation2("EKM","KERALA",obj1);
	 obj.display();
	 
 }
}
