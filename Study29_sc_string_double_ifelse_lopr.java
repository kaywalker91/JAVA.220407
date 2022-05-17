package Study0407;

import java.util.Scanner;

public class Study29_sc_string_double_ifelse_lopr 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String name;
		double key;
		double weight;
			
		System.out.print("이름:");
		name = sc.next();
		
		System.out.print("키:");
		key = sc.nextDouble();
		
		System.out.print("몸무게:");
		weight = sc.nextDouble();
		
		if((key<=190 && key>=180) && (weight<=75 && weight>=70))
		{
			System.out.println(name + " 당신은! 아이돌입니다~!");
		}
		else if((key<=179.9 && key>=175) && (weight<=85 && weight>=75.1))
		{
			System.out.println(name + " 당신은! 보통입니다~!");
		}
		else
		{
			System.out.println(name + " 당신은! 이하입니다~!");
		}

	}

}
