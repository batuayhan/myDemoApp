package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	System.out.println(harfSay(0,10,"batuhan ayhan",'a'));
    }
        public static int harfSay(int start, int end, String text, char a){
		int sayac=0;
		if(start>end||start<0||end>=text.length())
			return -1;
		for(int i=start; i<end; i++){
			if(text.charAt(i)==a)
				sayac++;
		}
	return sayac;
	}
			
}
