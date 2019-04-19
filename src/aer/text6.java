package aer;

import java.util.Random;

public class text6 {
	public static void main(String[] args)
	{
		int arr[]=new int[10];
		Random r=new Random(100);
		for(int i=0;i<10;i++)
		{
			arr[i]=r.nextInt(100);
			System.out.println(arr[i]);
		}
		System.out.println("--¸´ÖÆ--");
		int arr1[]=new int[10];
		System.arraycopy(arr, 0, arr1, 0,10);
		for(int i=0;i<10;i++)
		{
			System.out.println(arr1[i]);
		}
	}

}
