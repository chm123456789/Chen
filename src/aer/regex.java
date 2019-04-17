package aer;

public class regex {
	public static void main (String[] args)
	{
		tel();
	}
    public static void tel()
    {
    	String telnumber="(0000)0000-0000";
    	String regex="^^1[34578]\\d{9}|\\d{3}-\\d{4}-\\d{4}$";
    	System.out.println(telnumber.matches(regex));
    }
}
