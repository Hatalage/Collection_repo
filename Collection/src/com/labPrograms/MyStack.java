package com.labPrograms;

import java.util.Scanner;

public class MyStack {

	private static int[] arr = new int[10];
	private static int index = 0;

	public static void push(int data) {
		if (index < arr.length) {
			arr[index] = data;
			index++;
		} else {
			System.out.println("Stack is full" + data);
		}
	}

	public static void pop() {
		if (index > 0) {
			index--;
			arr[index] = 0;
		} else {
			System.out.println("Stack empty");
		}
	}

	public static void display() {
		if (index == 0) {
			System.out.println("Stack empty.");
		} else {

			for (int i = index - 1; i >= 0; i--) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		do {

			System.out.println("1.Push \n2.Pop \n3.Display \n4.Exit");
			System.out.println("Enter Choice: ");
			int choice = in.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter number of element push: ");
				int push = in.nextInt();
				
				for (int i = 0; i < push; i++) {
	
					System.out.println("Enter Element :");
					int num = in.nextInt();
					push(num);
				}
				display();
				break;

			case 2:
				pop();
				display();
				break;

			case 3:
				display();
				break;

			case 4:
				System.exit(0);
				break;

			}
		} while (true);
	}
}
