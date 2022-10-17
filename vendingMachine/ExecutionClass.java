package vendingMachine;

import java.util.Scanner;

public class ExecutionClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Products p[]=new Products[5];
		p[0]=new Products("idli",20);
		p[1]=new Products("dosa",25);
		p[2]=new Products("vada",30);
		p[3]=new Products("poha",35);
		p[4]=new Products("pulav",40);
		for(int i=0;i<5;i++) {
		System.out.println((i+1)+" "+p[i].toString());
		}
		Customer c=new Customer("Manojna","id01");
		System.out.println("Enter the menu number");
		int menuNumber=sc.nextInt();
		System.out.println("Enter the Quantity");
		int qty=sc.nextInt();
		int amt=c.getTotalAmount(p[menuNumber-1].getPrice(), qty);
		System.out.println("Enter the payment method\n 1 for card\n 2 for cash");
		int payment=sc.nextInt();
		if(payment==1) {
			amt*=2;
			System.out.println("final amount to be piad is "+amt);
		}
	
	}
}
