package Study0407;

import java.util.Scanner;

public class Study31_switch 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int grade;
		System.out.print("학년을 입력하시오:");
		grade = sc.nextInt();
		
		switch(grade)
		{
			case 1 : System.out.print("중학교1학년입니다.");
				break;
			case 2 : System.out.print("중학교2학년입니다.");
				break;
			case 3 : System.out.print("중학교3학년입니다.");
				break;
			default : System.out.print("1~3사이만 입력하시오.");
		
		}
	}

}
