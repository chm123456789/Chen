package aer;

public class Testwrap {
	public static void main(String[] args)
	{
		Integer i=new Integer (5);
		Double d=new Double("5.68");
	    int j=i.intValue()+d.intValue();
	    float f=i.floatValue()+d.floatValue();
	    System.out.println(j);
	    System.out.println(f);
	    double pi=Double.parseDouble("3.14");
	    double r=Double.valueOf("5.0").doubleValue();
	    double s=pi*r*r;
	    System.out.println(s);
	    
	    
	}

}
