package program;

import java.util.Scanner;

public class Pattern_4
{

	public static void main(String[] args) 
	{
		int n,i,j,space=1;
		Scanner nu=new Scanner(System.in);
		System.out.println("enter the number of rows");
		n=nu.nextInt();
		space=n-1;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=space;j++)
				System.out.print(" ");
			space--;
			for(j=1;j<=2*i-1;j++)
				System.out.print("*"+"");
			System.out.println();
		}
		space=1;
		for(i=1;i<=n-1;i++)
		{
			for(j=1;j<=space;j++)
				System.out.print(" ");
			space++;
			for(j=1;j<=2*(n-i)-1;j++)
				System.out.print("*"+"");
			System.out.println();
		}
		
		
	}

}
