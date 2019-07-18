package javaCodingInterviewQuestions;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class DeleteElementFromAnArray {
	
	public static void main(String[] args)
	{
		int[] intarray=new int[] {10,20,30,40,50,60,7};
		
		System.out.println("orginal arry : "+Arrays.toString(intarray));
		
		ArrayUtils.removeElement(intarray,2);
	}

}
