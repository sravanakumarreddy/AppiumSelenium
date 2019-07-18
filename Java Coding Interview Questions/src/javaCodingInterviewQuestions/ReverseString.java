package javaCodingInterviewQuestions;

public class ReverseString {
	
	// what is diff between string & StringBuffer
	// do we have reverse function in String 
	public static void main(String[] args)
	{
		String s="sravana kumar ";
		
		//1. using for loop
		int len=s.length();
		
		String rev="";
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
		
		//2. Using stringBuffer 
		
		StringBuffer st1=new StringBuffer(s);
		st1.reverse();
		
		System.out.println(st1);
		
		//3. Using StringBuilder
		
		 StringBuilder sb=new StringBuilder(s);  
		  System.out.println(  sb.reverse());
	}
	

}
