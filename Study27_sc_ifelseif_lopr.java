package Study0407;

import java.util.Scanner;

public class Study27_sc_ifelseif_lopr 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int score;
			
		System.out.print("점수를입력하시오:");
		score = sc.nextInt();
		
		if(score<=100 && score>=90)
		{
			System.out.println("A학점입니다.");
		}
		else if(score<90 && score>=80)
		{
			System.out.println("B학점입니다.");
		}
		else if(score<80 && score>=70)
		{
			System.out.println("C학점입니다.");
		}
		else
		{
			System.out.println("잘못된 점수입니다.");
		}
		
	}

}
