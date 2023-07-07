package com;

import java.util.Scanner;

public class TestException {

	public static void main(String[] args) {
		int arr[] = { 3, 5, 6, 8, 9 };
		String str = null;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Hello");
			System.out.println(10 / 0);
			System.out.println("Enter the index of array");
			int index = sc.nextInt();
			System.out.println(arr[index]);
			System.out.println(str.toUpperCase());
		} catch (ArithmeticException e) {
			System.out.println("Error1");
			return;
		} catch (NullPointerException e) {
			System.out.println("Error2");
			return;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error3");
			return;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		} finally {
			System.out.println("End Of Method");
			sc.close();
		}
	}

}
