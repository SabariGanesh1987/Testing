package corejavapack;

public class Basic2 {

	public static void main(String[] args) {
		Student1 s1=new Student1();
		s1.readvalues(10, "Ganesh");
		System.out.println(s1.intRno+","+s1.strName);
		s1.readvalues(12, "Ram");
		System.out.println(s1.intRno+","+s1.strName);
		
	}

}

class Student1{
	int intRno;
	String strName;
	void readvalues(int rno,String Name){
		intRno=rno;
		strName=Name;
		
	}
	
}
