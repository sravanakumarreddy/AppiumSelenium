package javaCodingInterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	public static void main(String[] arg)
	{
		String str="sravana";
		
		System.out.println(duplicateValues(str));
		
	}
	
	public static String duplicateValues(String str)
	{
		Set<Character> set=new HashSet<>();
		
		StringBuffer st=new StringBuffer();
		
		for(int i=0; i<str.length();i++)
		{
			Character c=str.charAt(i);
			
			if(!set.contains(c))
			{
				set.add(c);
				st.append(c);
			}
			
		}
		
		return st.toString();		
		
	}

}
