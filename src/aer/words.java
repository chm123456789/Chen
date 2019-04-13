package aer;

import java.lang.reflect.Array;
import java.util.Arrays;

import javax.lang.model.type.ArrayType;

public class words {
	@SuppressWarnings("unused")
	private static String str1="this is a test of java";
	

	
    public static void main (String[] args) {

    	test3();
    	
    }
    
	
	public static void test3(){

		char[] ch=new char[str1.length()];
		for(int i=0;i<str1.length();i++) {
			ch[i]=str1.charAt(i);
		}
		System.out.println(Arrays.toString(ch));
		char[] ch2=str1.toCharArray();
		System.out.println(Arrays.toString(ch2));
	
	}
	
}