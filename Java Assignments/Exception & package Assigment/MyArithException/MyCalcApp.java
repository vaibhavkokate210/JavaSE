package Exception;

import java.util.Scanner;

public class MyCalcApp {

	public static void main(String[] args) 
	{
		System.out.println("Enter the Number to be Doubled");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		Calculator c = new Calculator();
		try 
		{
			System.out.println(c.CalResult(no));
		}
		catch(MyArithException e)
		{
			e.printStackTrace();
		}
	}

}
