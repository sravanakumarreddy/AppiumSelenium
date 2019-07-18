package javaCodingInterviewQuestions;

public class ReverseAnInteger {
	public static void main(String[] args)
	{
		
		// 1. using algo
		int num=123456;
		int rev=0;
		
		while(num !=0)
		{
			rev= rev*10 + num%10;
			num = num/10;
		}
		System.out.println(rev);
		
		//2. using StringBuffer
		long num1=123456;
		
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	}

}
