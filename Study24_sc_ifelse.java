package Study0407;

import java.io.IOException;
import java.util.Scanner;

public class Study24_sc_ifelse 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num;
			
		System.out.print("숫자:");
		num = sc.nextInt();
		
		if(10>=num)
		{
			System.out.println("숫자가 10이하 입니다.");
		}
		else
		{
			System.out.println("숫자가 10초과 입니다.");

		}
		
	}

}
