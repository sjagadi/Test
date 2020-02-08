package com.jsonplaceholder.utils;

public class Utils 
{
	public static String getBigText()
	{
	    StringBuilder stringB = new StringBuilder(2000000);
	    String paddingString = "abcdefghijklmnopqrs";

	    while (stringB.length() + paddingString.length() < 2000000)
	        stringB.append(paddingString);
	    String bigText = "";
	    for (int i = 1; i<= 3; i++)
	    {
	        bigText = bigText + stringB.toString();
	    }
	    return bigText;
	}
}
