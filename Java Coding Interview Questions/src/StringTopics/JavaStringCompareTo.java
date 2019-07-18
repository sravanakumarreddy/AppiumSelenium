package StringTopics;

public class JavaStringCompareTo {
	/*
	 * The java string compareTo() method compares the given string with current
	 * string lexicographically. It returns positive number, negative number or 0.
	 * 
	 * It compares strings on the basis of Unicode value of each character in the
	 * strings.
	 * 
	 * if s1 > s2, it returns positive number  
      if s1 < s2, it returns negative number  
i      f s1 == s2, it returns 0  
	 */
	
	public static void main(String[] args) {
		
		String s1="Hello";  
		String s2="hello";  
		String s3="meklo";  
		String s4="hemlo";  
		String s5="flag";  
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareTo(s5));
		
		
		
		String ss1="hello";  
		String ss2="";  
		String ss3="me";  
		System.out.println(ss1.compareTo(ss2));  
		System.out.println(ss2.compareTo(ss3));  
		
		
	}

}
