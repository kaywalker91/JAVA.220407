package Study0407;

public class Study26_pr_lopr_ifelse 
{

	public static void main(String[] args) 
	{

		System.out.println("&& 양쪽조건에 참일때 : " + (10>1 && 10<100));
		System.out.println("&& 양쪽조건에 참일때 : " + (10<1 && 10<100));
		System.out.println("|| 양쪽조건중에 하나만 참일때 : " + (10>1 || 10>100));
		System.out.println("|| 양쪽조건중에 하나만 참일때 : " + (10<1 || 10>100));
		
		if(10<1 && 10<100)
		{
			System.out.println("양조건맞음!!");
		}
		else
		{
			System.out.println("양조건중 하나 이상 틀림!!");
		}
		if(10<1 || 10>100)
		{
			System.out.println("양조건중 하나만 맞음!!");
		}
		else
		{
			System.out.println("양조건 모두 틀림!!");
		}

	}

}
