package Study0407;

import java.util.Scanner;

public class Study25_sc_ifelseif_lopr 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int score;
			
		System.out.print("�������Է��Ͻÿ�:");
		score = sc.nextInt();
		
		if(score>=90)
		{
			System.out.println("A�����Դϴ�.");
		}
		else if(score<90)
		{
			System.out.println("B�����Դϴ�.");

		}

	}

}
