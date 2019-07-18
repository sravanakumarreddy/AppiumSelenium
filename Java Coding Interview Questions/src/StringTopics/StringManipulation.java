package StringTopics;

public class StringManipulation {
	public static void main(String[] args)
	{
		String str="i am working on test case design";
		String str1="I am working on test case design";
		
		
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		
		System.out.println(str.indexOf('s')); //1st occurence of s
		System.out.println(str.indexOf('s', str.indexOf('s')+1)); //2nd occurence of s
		
		System.out.println(str.indexOf("am"));
		
		System.out.println(str.indexOf("hello"));
		
		//String comparsion
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		
		//sub String
		
		System.out.println(str.substring(0, 10));
		
		
		//trim - Remove before and after space of string
		
		String s="  i am   ";
		System.out.println(s.replace(" ", ""));
		System.out.println(s.trim());
		
		String data="01-01-1999";
		System.out.println(data.replaceAll("-", "/"));
	
		
		//Split
		
		String sp="i_am_learning_java";
		
		String spVal[]=sp.split("_");
		
		for(int i=0; i<spVal.length; i++)
		{
			System.out.println(spVal[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
