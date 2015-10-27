package myPack;

public class StringToInteger {
public static void main(String args[])
{
	StringToInteger stringti=new StringToInteger();
	System.out.println(stringti.charrToInt("6555"));
	
	
}
public int charrToInt(String a)
{
	int zero=(int) '0';
	int sum=0;
	char[] ch=a.toCharArray();
	for(char chr:ch)
	{
		int tmp=(int) chr;
		sum=sum*10 +(tmp-zero);
	}
	return sum;
}
}
