package aer;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

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
		System.out.println("--����--");
		int arr1[]=new int[10];
		System.arraycopy(arr, 0, arr1, 0,10);
		for(int i=0;i<10;i++)
		{
			System.out.println(arr1[i]);
		}
		System.out.println("---����--");
		Arrays.parallelSort(arr1);
		for(int i=0;i<10;i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("--����--");
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int find=-1;
		if((find=Arrays.binarySearch(arr1,s))>-1)
		{
			System.out.println("Ԫ�����ڵ�λ���ǣ�"+find);
			
		}else {
			System.out.println("û�и�����");
		}
			
		
		
		
		
	}

}
