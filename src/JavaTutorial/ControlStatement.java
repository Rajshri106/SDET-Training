package JavaTutorial;

public class ControlStatement {

	public void If_ElseStatement()
	{
		int n = 8;
		if(n%2==0)
		{
			System.out.println("Even number is : "+n);
		}
		else
		{
			System.out.println("Odd number is : "+n);
		}
	}
	
	public void ForLoop()
	{
		int n = 10;
		int count=0;
		for(int i =0;i<=n;i++)
		{
			count++;
		}
		System.out.println("count is :"+count);
	}
	
	public void SwitchClass()
	{
		int n =5;
		switch(n)
		{
			case 1 :
				System.out.println("The 1 number is matched");
				break;
			case 2 :
				System.out.println("The 2 number is matched");
				break;
			case 3 :
				System.out.println("The 3 number is matched");
				break;
			case 4 :
				System.out.println("The 4 number is matched");
				break;
			case 5 :
				System.out.println("The 5 number is matched");
				break;
			default :
				System.out.println("Default");
				break;
				
		}
	}
	
	public void DoWhileLoop()
	{
		int n = 8,i=0;
		
		do
		{
			i++;
			System.out.println(i);
		}while(false);
	}
	
	public static void main(String[] args)
	{
		ControlStatement cs = new ControlStatement();
		cs.If_ElseStatement();
		cs.ForLoop();
		cs.SwitchClass();
		cs.DoWhileLoop();
	}
}
