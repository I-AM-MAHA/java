package javaprograms1;

import java.util.Scanner;

public class SearchElement {
	public static void main(String args[]) {
		int n,x,flag=0,i=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter no of element yoy want in array");
		n=s.nextInt();
		int[] a=new int[n];
		System.out.println("Enter all the element");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.print("Enter the element you want to find");
		x=s.nextInt();
		for(i=0;i<n;i++) {
			if(a[i]==x) {
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
		}
		if(flag==1)
		{
			System.out.print("Element found at position"+(i+1));
		}
		else
		{
			System.out.print("Element not found");
		}
	}

}
