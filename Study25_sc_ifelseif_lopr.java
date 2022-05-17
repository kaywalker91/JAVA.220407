package Study0407;

import java.util.Scanner;

public class Study25_sc_ifelseif_lopr 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int score;
			
		System.out.print("점수를입력하시오:");
		score = sc.nextInt();
		
		if(score>=90)
		{
			System.out.println("A학점입니다.");
		}
		else if(score<90)
		{
			System.out.println("B학점입니다.");

		}

	}

}
