package com.gqt.corejava.patterns;
import java.util.Scanner;

public class Program13{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the size: ");
		int n = sc.nextInt();
		for (int i=1;i<=n;i++) {
			int num=0;
			num= num+i;

			for (int j=1;j<=n;j++) {
				System.out.print(num + " ");
				num+=5;
				

			}
			
			System.out.println();
		

		}
	}

}
