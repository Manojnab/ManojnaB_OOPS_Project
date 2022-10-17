package FoundationsFinalAssessment;

public class powerOfN {
	public static void PowerOfXOverN(int x,int n) {
		int product=1;
		while(n>0) {
			if(n%2==1) {
				product*=x;
			}
			x*=x;
			n/=2;
		}
		System.out.println(product);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PowerOfXOverN(2, 6);
	}

}
