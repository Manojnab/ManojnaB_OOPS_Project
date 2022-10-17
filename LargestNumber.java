package FoundationsFinalAssessment;

import java.util.Arrays;

public class LargestNumber {
	public static void largeNumber(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = 0;
                String istr=Integer.toString(arr[i]);
                String jstr=Integer.toString(arr[j]);
                //System.out.println(istr);
                //System.out.println(jstr);
                if (arr[j] > arr[i] && istr.length()==jstr.length()) {
                	//System.out.println("first loop");
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                else if (arr[j] > arr[i] && istr.length()!=jstr.length()) {
                	 
                    // Swapping
                	//System.out.println("second loop");
                	if(istr.length()>jstr.length()) {
                		int flag=0;
                		for(int x=0;x<jstr.length();x++) {
                			int ifirstDigit=istr.charAt(x)-'0';
                        	int jfirstDigit=jstr.charAt(x)-'0';
                        	if(ifirstDigit>jfirstDigit) {
                        		flag=1;
                        		break;
                        	}
                        	
                		}
                		if(flag==1) {
                            temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                	}
                	}
                	else if(istr.length()<jstr.length()) {
                		int flag=0;
                		for(int x=0;x<istr.length();x++) {
                			int ifirstDigit=istr.charAt(x)-'0';
                        	int jfirstDigit=jstr.charAt(x)-'0';
                        	if(ifirstDigit<jfirstDigit) {
                        		flag=1;
                        		break;
                        	}
                        	
                		}
                		if(flag==1) {
                                temp = arr[i];
                                arr[i] = arr[j];
                                arr[j] = temp;
                		}
                		
                	}
                }
                else if (arr[j] < arr[i] && istr.length()!=jstr.length()) {
               	 
                    // Swapping
                	int flag=0;
                	//System.out.println("third loop");
                	if(istr.length()>jstr.length()) {
                		for(int x=0;x<jstr.length();x++) {
                			int ifirstDigit=istr.charAt(x)-'0';
                        	int jfirstDigit=jstr.charAt(x)-'0';
                        	if(ifirstDigit<jfirstDigit) {
                        		flag=1;
                        		break;
                        	}
                        	
                		}
                		if(flag==1) {
                            temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                	}
                	}
                	else if(istr.length()<jstr.length()) {
                		for(int x=0;x<istr.length();x++) {
                			int ifirstDigit=istr.charAt(x)-'0';
                        	int jfirstDigit=jstr.charAt(x)-'0';
                        	if(ifirstDigit>jfirstDigit) {
                        		flag=1;
                        		break;
                        	}
                        	
                		}
                		if(flag==1) {
                            temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                	}
                	}
                	
                }
               // System.out.println(Arrays.toString(arr));
            }
            
	}
		
	}
	public static void swap(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
	}

	public static void main(String[] args) {
		int arr[]=new int[] {9,95,99,995,999};
		largeNumber(arr);
		for(int i : arr) {
			 System.out.print(i);
			}

	}

}
