package StringTopics;

public class JavaStringCharAt {
	
	//The java string charAt() method returns a char value at the given index number.
	// Throws : StringIndexOutOfBoundsException : if index is negative value or greater than this string length.
	
	public static void main(String[] args)
	{
		String s="sravana";
		
		
		System.out.println(s.charAt(4));
		//System.out.println(s.charAt(11));
		System.out.println(s.charAt(4));
		
		
		String str = "Welcome to Javatpoint portal";      
	    int strLength = str.length();      
	    // Fetching first character  
	    System.out.println("Character at 0 index is: "+ str.charAt(0));      
	    // The last Character is present at the string length-1 index  
	    System.out.println("Character at last index is: "+ str.charAt(strLength-1));
	    
	    for(int i=0; i<strLength-1;i++)
	    {
	    	System.out.println("char at "+i+" place  "+str.charAt(i));
	    }
	}

}
