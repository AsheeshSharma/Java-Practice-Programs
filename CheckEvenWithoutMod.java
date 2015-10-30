package myPack;

public class CheckEvenWithoutMod {
public static void main(String args[])
{
	int n=6;
	while(n>=2)
	{
		n=n-2;
	}
	if(n==1)
		System.out.println("Odd Nummber Found");
	else
		System.out.println("Even Number Found");
}
}
