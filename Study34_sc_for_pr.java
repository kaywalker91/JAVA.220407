package Study0407;

import java.util.Scanner;

public class Study34_sc_for_pr 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int count;
			
		System.out.print("�ݺ��� �� ���� �Է�:");
		count = sc.nextInt();
		
		for(int i=0; i<count; i++)
		{
			System.out.println(i+1 + "�� : �ȳ��ϼ���!!");
		}
		
		for(int i=count; i>0; i--)
		{
			System.out.println(i + "�� : �ȳ���������!!");
		}

	}

}
