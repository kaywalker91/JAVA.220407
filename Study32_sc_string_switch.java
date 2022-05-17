package Study0407;

import java.util.Scanner;

public class Study32_sc_string_switch 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String score;
		System.out.print("학점을 입력하시오:");
		score = sc.next();
		
		switch(score)
		{
			case "A" : System.out.print("90점이상입니다.");
				break;
			case "B" : System.out.print("80점이상입니다.");
				break;
			case "C" : System.out.print("70점이상입니다.");
				break;
			default : System.out.print("입력오류입니다.");
		
		}	
	}

}
