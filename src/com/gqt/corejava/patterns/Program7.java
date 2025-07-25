package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Program7{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the size: ");
		int n = sc.nextInt();
		int num=1;
		for (int i =1;i<=n;i++) {
			System.out.print(num);
			num++;
		}
	}

}
