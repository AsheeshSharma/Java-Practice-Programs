package myPack;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
public static void main(String args[]) throws ParseException
{
	SimpleDateFormat  simpleDateFormat=new SimpleDateFormat("dd/mm/yyyy");
	String dateString="11/12/2010";
	Date d=simpleDateFormat.parse(dateString);
	System.out.println(d);
}
}
