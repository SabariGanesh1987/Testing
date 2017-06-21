package corejavapack;

public class Basic {

	
	public static void main(String[] args) {
		Student b= new Student();
		Student b1=new Student();
		b.id=100;
		b.name="Ganesh";
		b1.id=101;
		b1.name="REEDDI";
		
		System.out.println("ID="+b.id+",Name="+b.name);
		System.out.println("ID="+b1.id+",Name="+b1.name);
		
	}
}

 class Student{
	int id;
	String name;
	
}