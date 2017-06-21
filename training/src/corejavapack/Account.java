package corejavapack;

 class TestAccount {
	int accno;
	String name;
	float amount;
	void insert(int accno,String name,float amount){
		this.accno=accno;
		this.name=name;
		this.amount=amount;
	}
	
	void deposit(float amount){
		this.amount=this.amount+amount;
		System.out.println(amount+" Deposited");
	}
	void withdraw(float amount){
		if(this.amount<amount){
			System.out.println("Insufficient Balance");
		}
		else{
			this.amount=this.amount-amount;
			System.out.println("Withdrawn amount:="+amount);
		}
	}
	
	void checkbalanace(){
		System.out.println("Balance in account is :="+amount);
	}
	void printaccountdetails(){
		System.out.println("Account no:="+accno+" , Name:="+name+" , amount:="+amount);
	}
}
 public class Account{
	 public static void main(String[] args) {
		 TestAccount t=new TestAccount();
		 t.insert(123456, "Ganesh", 1128298.00f);
		 t.printaccountdetails();
		 t.checkbalanace();
		 t.withdraw(10000);
		 t.checkbalanace();
		 t.deposit(12);
		 t.checkbalanace();
		 t.withdraw(100000);
		 t.checkbalanace();
		 
	}
	 
	 
	 
	 
 }
