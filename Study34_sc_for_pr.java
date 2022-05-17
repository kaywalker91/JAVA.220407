package Study0407;

import java.util.Scanner;

public class Study34_sc_for_pr 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int count;
			
		System.out.print("반복할 줄 수를 입력:");
		count = sc.nextInt();
		
		for(int i=0; i<count; i++)
		{
			System.out.println(i+1 + "번 : 안녕하세요!!");
		}
		
		for(int i=count; i>0; i--)
		{
			System.out.println(i + "번 : 안녕히가세요!!");
		}

	}

}
