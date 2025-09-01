package hw1;



public class program {
	

public class Exercise1
{
	public static boolean check(String str, String ending)
	
	{
		if(str.contains(ending))
			
        {
			
            return true;
            
        }
	
		
		return false;
	}
}


public class Exercise2
{
	public static int countOfSymbol(String str)
	{
		
	  int count = 0;
	  
	  try
	  {
		  while(true)
		  {
			  str.charAt(count);
			  count++;
		  }
	  
	   } 
	  
	  catch (IndexOutOfBoundsException e) {
	     
	    }
	  
	  return count;
		
	}
}


	public static void main(String[] args) {
		
	
	
	String str1 = new String("Cullinan");
	String str2 = new String("ulli");
	
	boolean result = Exercise1.check(str1, str2);
	
	if(result == true)
	{
		System.out.println("str1 includes str2");
	}
	
	else
	{
		System.out.println("str1 is not include str2");
	}
	
	String str = new String("a777mp");
	
	
	System.out.println(Exercise2.countOfSymbol(str));

	}

}
