package Study0407;

import java.util.Scanner;

public class Study31_switch 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int grade;
		System.out.print("�г��� �Է��Ͻÿ�:");
		grade = sc.nextInt();
		
		switch(grade)
		{
			case 1 : System.out.print("���б�1�г��Դϴ�.");
				break;
			case 2 : System.out.print("���б�2�г��Դϴ�.");
				break;
			case 3 : System.out.print("���б�3�г��Դϴ�.");
				break;
			default : System.out.print("1~3���̸� �Է��Ͻÿ�.");
		
		}
	}

}
