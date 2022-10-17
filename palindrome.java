package FoundationsFinalAssessment;

import java.util.Scanner;

public class palindrome {
	
	public void palindro(int j,int i,String s,char c[]) {
		c[j]=s.charAt(i);
		i--;
		j++;
		if(i>=0&&j<s.length()) {
			palindro(j,i,s,c);
			
		}
		else {
		String reverseString=String.copyValueOf(c);
		if(s.compareTo(reverseString)==0) {
			System.out.println("is a palindrome");
			
		}
		else {
			System.out.println("is not a palindrome");
		}
		}
		
		
	}

	/*char c[]=new char[s.length()];
	for(int i=(s.length()-1),j=0;i>=0&&j<s.length();i--,j++) {
		c[j]=s.charAt(i);
		
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int i=s.length()-1,j=0;
		char c[]=new char[s.length()];
		palindrome p=new palindrome();
		
		//System.out.println(c);
		p.palindro(j,i,s,c);
		String reverseString=String.copyValueOf(c);

		//System.out.println(reverseString);
	}

}
