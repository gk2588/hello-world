package HelloWorld;
class account {
	int accno;
	String name;
	float amount;
	void insert(int acc,String n,float am) {
		accno=acc;
		name=n;
		amount=am;
	}
	void deposit(float damt) {
		amount=amount+damt;
		System.out.println(damt+ "is deposited successfully - THANKS FOR USING OUR SERVICE");
	}
	void withdraw(float wamt) {
		if (wamt>amount) {
			System.out.println("Insufficient balance");
		}else {
			amount=amount-wamt;
			System.out.println(wamt+" - is withdrawn successfully");
		}
	}
	void balance(){
		System.out.println("the balance amount in your account is "+amount);
	}
	void accinfo() {
		System.out.println("YOUR ACCOUNT NUMBER: "+accno);
		System.out.println("YOUR NAME: "+name);
		System.out.println("THANKS FOR USING OUR BANK");
	}
}
public class AccountTest {
public static void main(String[]args) {
	account a1=new account();
	a1.insert(1111,"Kishore",50000);
	a1.accinfo();
	a1.balance();
	a1.deposit(4000);
	a1.balance();
	a1.withdraw(80000);
	a1.withdraw(4000);
	a1.balance();
}
}
