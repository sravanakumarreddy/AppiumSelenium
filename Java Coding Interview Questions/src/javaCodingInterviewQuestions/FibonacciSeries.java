package javaCodingInterviewQuestions;

public class FibonacciSeries {
	
	public static void main(String[] args)
	{
		int max=10;
		int n1=0;
		int n2=1;
		
		for(int i=1; i<max; i++)
		{
			System.out.println(n1+" ");
			int sum=n1+n2;
			n1=n2;
			n2=sum;
			
			
		}
	}

}
