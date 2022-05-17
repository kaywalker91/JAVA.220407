package Study0407;

import java.util.Scanner;

public class Study28_sc_ifelse_lopr 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int korscore,engscore,mathscore;
			
		System.out.print("국어:");
		korscore = sc.nextInt();
		
		System.out.print("영어:");
		engscore = sc.nextInt();
		
		System.out.print("수학:");
		mathscore = sc.nextInt();
		
		int sum = korscore+engscore+mathscore;
		int avg = sum/3;
		
		if(avg<=100 && avg>=90)
		{
			System.out.println("평균은 " + avg + "이고 A학점입니다.");
		}
		else if(avg<90 && avg>=80)
		{
			System.out.println("평균은 " + avg + "이고 B학점입니다.");
		}
		else if(avg<80 && avg>=70)
		{
			System.out.println("평균은 " + avg + "이고 C학점입니다.");
		}
		else
		{
			System.out.println("평균은 " + avg + "이고 E학점입니다.");
		}

	}

}
