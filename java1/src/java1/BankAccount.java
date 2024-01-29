package java1;
class Account{
	private String accnum="";
	private String accholder="";
	private double balance=0;
	
	
	public  Account(String accnum,String accholder,double balance) {
		this.accnum=accnum;
		this.accholder=accholder;
		this.balance=balance;
		
	}
	public void deposit(int depo) {
		 
		
			if(depo>=100) {
				balance+=depo;
				System.out.println("Accno: "+accnum+"\n"+"Name: "+accholder);
				System.out.println("Money Deposited : RS."+balance);
			}
			else{
				System.out.println("Invalid Deposit");
				}
		}
	public void withdrawal(double balance,int with) {
		 
		
		try {
			if(balance>=100.0) {
				balance-=balance;
				System.out.println("Accno: "+accnum+"\n"+"Name: "+accholder);
				System.out.println("Money withdrawn : RS."+with);
				
				
			}
else {
				
				System.out.println("Withdrawal suspended"+"\n"+"Minimum balance is RS.100.0");
				
			}
		}
		catch(Exception e){
			System.out.println("Try after sometime");
			
		}
		
	}
		
		
		
		
		}


public class BankAccount {
	public static void main(String[]args) {
		Account b1=new Account("1234","s",200.0);
		Account b2=new Account("1235","sa",200.0);
		Account b3=new Account("1236","sar",200.0);
		Account b4=new Account("1237","saru",200.0);
		b1.deposit(200);
		b2.deposit(90);
		b3.withdrawal(90.0,100);
		b4.withdrawal(200.0,100 );
		
		}}
	



