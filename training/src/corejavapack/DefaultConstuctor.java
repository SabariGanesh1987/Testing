package corejavapack;

public class DefaultConstuctor {
	int id;
	String name;
	void display(){
		System.out.println("id:="+id+" ,name:="+name);
	}
	public static void main(String[] args) {
		DefaultConstuctor dc=new DefaultConstuctor();
		dc.display();
		ParameterizedConstructor pc=new ParameterizedConstructor(111, "Ganesh");
		pc.display();
		
	}

}

class ParameterizedConstructor{
	int id;
	String name;
	void display(){
		System.out.println("ID:="+id+", Name:="+name);
	}
	public ParameterizedConstructor(int id,String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}
}