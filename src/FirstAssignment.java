

public class FirstAssignment {
 

public static void areOccurrencesEqual(String s) { 

	
	    int maxSize = 100;
		int count1[] = new int[maxSize];
		int count2[] = new int[0];
		int len = s.length();
        // Initialize count array index
        for ( int i = 0; i < s.length(); i++)
        {    
        	count1[s.charAt(i)]++;

        }
        
        //traverse string
        char letter[] = new char[s.length()];
        for(int i=0;i<=len;i++)
		{
	        
        	letter[i] = s.charAt(i);
			
			int flag = 0;
			int j=0;
			
			while(j<=i)
			{
				
				if(s.charAt(i)==letter[j])
				{
					flag++;
					
				}
				j++;
				
			}
			
			if(flag==1)
			{
			
			System.out.println("count total number of"+" "+letter[i]+" =  "+count1[s.charAt(i)]);
			
			}
        } 
        if(count1[0] == count1[1] && count1[1] == count1[2] && count1[2] == count1[0])
        {
        	System.out.println("The total occurances are equal is ="+count1[0]);
        }
}
	
	public static void main(String[] args)
    {
        
        String s = "bbcabc";
 
        areOccurrencesEqual(s);
    }
	
	
	
	}
