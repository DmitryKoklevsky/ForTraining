package Fortask14;

public class task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		short b = 10;
		long c = 10000;
		double d = 6666.66;
		float e = 3.14f;
		char f = 'w';
		boolean z = false;
		int result1 = a + b;
		double result2 = c - d;
	    double result3 = e * d;
	    boolean result4 = (c > d);//long>double
	    boolean result5 = (e < a);//float<int    
		System.out.println("result1 = " + result1 );
		System.out.println("result2 = " + result2 );
		System.out.println("result3 = " + result3 );
	    System.out.println("result4 = " + result4);
	    System.out.println("result5 = " + result5);
	    if (c > d) //сравнение long и doule
	    {
	    System.out.println("c > d");
	    }
	    else if (d > c)
	    {
	    	System.out.println("d > c");
	    }
	    else if (c == d)
	    {
	    	System.out.println("d = c");
	    }		
	}

}
