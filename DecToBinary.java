package myPack;

public class DecToBinary {
public static void main(String args[])
{
	DecToBinary decToBinary=new DecToBinary();
	decToBinary.printBinaryFormat(25);
}
public void printBinaryFormat(int number){
	int[] binary=new int[25];
	int i=0;
	while(number>0)
	{
		binary[i++]=number%2;
		number=number/2;
	}
	for(int index=i-1;index>=0;index--)
	{
		System.out.println(binary[index]);
	}
}
}

