package com.greatlearning.ques1;

import java.util.Scanner;

public class ConstructionOrder {
	public void displayOrder() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of floors in the building : ");
		int floors = sc.nextInt();
		int x[] = new int[floors + 1];
		for (int i = 1; i < floors + 1; i++) {
			System.out.println("Enter the floor size given on day " + i + ":");
			int floorsize = sc.nextInt();
			x[floorsize] = i;
		}
		int j = floors;
		boolean flag;
		System.out.println("The order of construction is as follows ");
		for (int i = 1; i <= floors; i++) {
			flag = false;
			System.out.println("Day " + i + " :");
			while (j >= 1 && x[j] <= i) {
				flag = true;
				System.out.print(j + " ");
				j--;
			}
			if (flag == true) {
				System.out.println();
			}
			sc.close();
		}
	}
}
