package Study0407;

import java.io.IOException;

public class Study33_systeminread_char_switch 
{

	public static void main(String[] args) throws IOException 
	{
		char score;
		System.out.print("학점을입력하시오: ");
		score = (char) System.in.read();
		
		switch(score)
		{
			case 'A' : System.out.print("90점이상입니다.");
				break;
			case 'B' : System.out.print("80점이상입니다.");
				break;
			case 'C' : System.out.print("70점이상입니다.");
				break;
			default : System.out.print("입력오류입니다.");
		
		}	

	}

}
