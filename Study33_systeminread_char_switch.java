package Study0407;

import java.io.IOException;

public class Study33_systeminread_char_switch 
{

	public static void main(String[] args) throws IOException 
	{
		char score;
		System.out.print("�������Է��Ͻÿ�: ");
		score = (char) System.in.read();
		
		switch(score)
		{
			case 'A' : System.out.print("90���̻��Դϴ�.");
				break;
			case 'B' : System.out.print("80���̻��Դϴ�.");
				break;
			case 'C' : System.out.print("70���̻��Դϴ�.");
				break;
			default : System.out.print("�Է¿����Դϴ�.");
		
		}	

	}

}
