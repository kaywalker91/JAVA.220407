package Study0407;

import java.util.Scanner;

public class Study28_sc_ifelse_lopr 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int korscore,engscore,mathscore;
			
		System.out.print("����:");
		korscore = sc.nextInt();
		
		System.out.print("����:");
		engscore = sc.nextInt();
		
		System.out.print("����:");
		mathscore = sc.nextInt();
		
		int sum = korscore+engscore+mathscore;
		int avg = sum/3;
		
		if(avg<=100 && avg>=90)
		{
			System.out.println("����� " + avg + "�̰� A�����Դϴ�.");
		}
		else if(avg<90 && avg>=80)
		{
			System.out.println("����� " + avg + "�̰� B�����Դϴ�.");
		}
		else if(avg<80 && avg>=70)
		{
			System.out.println("����� " + avg + "�̰� C�����Դϴ�.");
		}
		else
		{
			System.out.println("����� " + avg + "�̰� E�����Դϴ�.");
		}

	}

}
