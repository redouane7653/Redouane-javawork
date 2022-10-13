package unit;

public class Calculator {
	public static int findBig(int x, int y)
	{
		if(x>y)
			return x;
		else return y;
	}
	
public static int findSmall(int x, int y)
{
	if (x>y)
		return y;
	else return x;
}



public static int findBiggest(int a, int b, int c)
{
	

if(a>b && b>c)
	return a;

else if(b>a && b>c)
	return b;
else 
	return c;
}

public static boolean findAvgMarks(int x, int y, int z) {
        if (((x + y + z) / 3 ) > 70) {
            return true;
        } else
            return false;
    }
}



