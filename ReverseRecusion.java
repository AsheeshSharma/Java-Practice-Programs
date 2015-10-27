package myPack;

public class ReverseRecusion {
public static void main(String args[])
{
	String data="Asheesh";
	ReverseRecusion reverseRecusion=new ReverseRecusion();
	String output=reverseRecusion.rev(data);
	String output2=reverseRecusion.rev("123456");
	System.out.println(output);
	System.out.print(output2);
}
public String rev(String a)
{
	String result="";
	if(a.length()==1)
	{
		return a;
	}
	else
	{
		result+=a.charAt(a.length()-1)+rev(a.substring(0,a.length()-1));
		return result;
	}
	
}
}
