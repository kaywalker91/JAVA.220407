package Study0407;

import java.util.Scanner;

public class Study30_sc_if_if_if_if 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String name;
		double key;
		double weight;
			
		System.out.print("�̸�:");
		name = sc.next();
		
		System.out.print("Ű:");
		key = sc.nextDouble();
		
		System.out.print("������:");
		weight = sc.nextDouble();
		
		if(key<=190)
		{
			if(key>=180)
			{
				if(weight<=75)
				{
					if(weight>=70)
					{
						System.out.println(name + " �����! ���̵��Դϴ�~!");
					}
				}
			
			}
		}
		else if((key<=179.9 && key>=175) && (weight<=85 && weight>=75.1))
		{
			System.out.println(name + " �����! �����Դϴ�~!");
		}
		else
		{
			System.out.println(name + " �����! �����Դϴ�~!");
		}

	}

}
