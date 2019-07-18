package javaCodingInterviewQuestions;

public class FindMissingNumberInArray {
	
	public static void main(String[] args)
	{
		//1+2+3+5+6 =17
		//1+2+3+4+5+6=21
		// missing no=21-17 = 4
		
		int sum=0;
		int a[]= {1,2,3,5,6};
		for(int i=0; i<a.length; i++)
		{
			sum=sum+a[i];
			
		}
		System.out.println(sum);
		
		int sum1=0;
		
		for(int j=0; j<=6;j++)
		{
			sum1=sum1+j;
			
		}
		System.out.println(sum1);
		
		System.out.println("missing no is : -"+ (sum1-sum));
	}

}
