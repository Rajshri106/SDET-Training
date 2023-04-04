package JavaTutorial;

public class ControlStatement {

	public void if_ElseStatement()
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
	
	public void forLoop()
	{
		int n = 10;
		int count=0;
		for(int i =0;i<=n;i++)
		{
			count++;
		}
		System.out.println("count is :"+count);
	}
	
	public void switchClass()
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
	
	public void doWhileLoop()
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
		cs.if_ElseStatement();
		cs.forLoop();
		cs.switchClass();
		cs.doWhileLoop();
	}
}
