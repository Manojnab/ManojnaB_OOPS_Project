package FoundationsFinalAssessment;

import java.util.Arrays;

public class TwoElementTarget {
	public static int[] sumOfTwoElements(int arr[],int target) {
		int n=arr.length;
		int oparr[]=new int[2];
		int flag=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]+arr[j]==target) {
					oparr[0]=i;
					oparr[1]=j;
					flag=1;
					break;
				}
			}
			//break;
			if(flag==1) {
				break;
			}
		}
		return oparr;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[2];
		int inarr[]=new int[] {2,7,11,15};
		arr=sumOfTwoElements(inarr, 9);
		System.out.println(Arrays.toString(arr));
	}

}
