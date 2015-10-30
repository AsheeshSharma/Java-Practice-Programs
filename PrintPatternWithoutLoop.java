package myPack;

public class PrintPatternWithoutLoop {
	public static void main(String args[])
	{
		int n = 16;
		PrintPatternWithoutLoop print=new PrintPatternWithoutLoop();
		print.printPattern(n, n, true);
	}
	void printPattern(int n, int m, Boolean flag)
	{
		System.out.println(m);
		if(m==n && flag==false)
		{
			return;
		}
		if(flag)
		{
			if(m-5>0)
			{
				printPattern(n,m-5,true);
			}
			else
			{
				 printPattern(n, m-5, false);
			}
		}
		else
			printPattern(n,m+5,false);
	}
}
