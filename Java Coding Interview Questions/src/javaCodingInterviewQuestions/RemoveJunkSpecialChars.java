package javaCodingInterviewQuestions;

public class RemoveJunkSpecialChars {
	public static void main(String[] args)
	{
		String s="@#$%^&VHJIOOKJN%TGB3456789Tyb*00!@#$%^^Y BNHJIJ m";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
	}
	

}
