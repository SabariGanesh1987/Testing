package corejavapack;

public class ObjectCreation {
void  fact(int n){
	int f=1;
	for(int i=1;i<=n;i++){
		f=f*i;
		}
	System.out.println(f);
}
public static void main(String[] args) {
	new ObjectCreation().fact(5);
	
}
}




