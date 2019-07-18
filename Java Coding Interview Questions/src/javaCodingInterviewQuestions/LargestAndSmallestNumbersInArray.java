package javaCodingInterviewQuestions;

public class LargestAndSmallestNumbersInArray {
	public static void main(String[] arg) {
		
		int numbers[]= {5,55,0,89,999,85455,-1};
		
		int largest=numbers[0];
		int smallest=numbers[0];
		
		for(int i=0;i<numbers.length; i++)
		{
			if (numbers[i]>largest)
			{
				largest=numbers[i];
			}
			else if(numbers[i]<smallest)
			{
				smallest=numbers[i];
			}
		}
		System.out.println(smallest);
		System.out.println(largest);
	}

}
