package Study0407;

public class Study26_pr_lopr_ifelse 
{

	public static void main(String[] args) 
	{

		System.out.println("&& �������ǿ� ���϶� : " + (10>1 && 10<100));
		System.out.println("&& �������ǿ� ���϶� : " + (10<1 && 10<100));
		System.out.println("|| ���������߿� �ϳ��� ���϶� : " + (10>1 || 10>100));
		System.out.println("|| ���������߿� �ϳ��� ���϶� : " + (10<1 || 10>100));
		
		if(10<1 && 10<100)
		{
			System.out.println("�����Ǹ���!!");
		}
		else
		{
			System.out.println("�������� �ϳ� �̻� Ʋ��!!");
		}
		if(10<1 || 10>100)
		{
			System.out.println("�������� �ϳ��� ����!!");
		}
		else
		{
			System.out.println("������ ��� Ʋ��!!");
		}

	}

}
