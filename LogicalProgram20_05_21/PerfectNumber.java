package com.ojas.ak;

import java.util.Scanner;

public class PerfectNumber {
	public static boolean perfect(int num)
	{
	int sum = 1;

	for (int i=2; i*i <= num; i++)
	{
	if (num % i == 0)
	{
	if(i*i != num)
	sum = sum + i + num / i;
	else
	sum=sum+i;
	}
	}

	if (sum == num && num != 1)
	return true;

	return false;
	}

	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number ");
	int num = sc.nextInt();

	if(perfect(num))
	{
	System.out.print(num + " is a Perfect Number");
	}
	else
	{
	System.out.print(num + " is not a Perfect Number ");
	}
	}

}
