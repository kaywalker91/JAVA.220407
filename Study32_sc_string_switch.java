package Study0407;

import java.util.Scanner;

public class Study32_sc_string_switch 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String score;
		System.out.print("������ �Է��Ͻÿ�:");
		score = sc.next();
		
		switch(score)
		{
			case "A" : System.out.print("90���̻��Դϴ�.");
				break;
			case "B" : System.out.print("80���̻��Դϴ�.");
				break;
			case "C" : System.out.print("70���̻��Դϴ�.");
				break;
			default : System.out.print("�Է¿����Դϴ�.");
		
		}	
	}

}
