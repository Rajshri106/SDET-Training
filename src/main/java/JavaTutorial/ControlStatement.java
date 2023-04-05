package JavaTutorial;

public class ControlStatement {

	public void if_ElseStatement()
	{
		int number = 8;
		if(number%2==0)
		{
			System.out.println("Even number is : "+number);
		}
		else
		{
			System.out.println("Odd number is : "+number);
		}
	}
	
	public void forLoop()
	{
		int number = 10;
		int count=0;
		for(int i =0;i<=number;i++)
		{
			count++;
		}
		System.out.println("count is :"+count);
	}
	
	public void switchClass()
	{
		int number =5;
		switch(number)
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
		int number = 8,i=0;
		
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
