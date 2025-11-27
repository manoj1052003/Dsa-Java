package com.novdec.string;
import java.util.Scanner;

public class finalcode
{   
    static void reverseString(String inputString)
    {
         
        char[] inputStringArray = inputString.toCharArray();
                  
        char[] resultArray = new char[inputStringArray.length];
                  
        for (int i = 0; i < inputStringArray.length; i++) 
        {
            if (inputStringArray[i] == ' ') 
            {
                resultArray[i] = ' ';
            }
        }
     
        int j = resultArray.length-1;
                        
        for (int i = 0; i < inputStringArray.length; i++)
        {
            if (inputStringArray[i] != ' ') 
            {
                //If resultArray already has space at index j then decrementing 'j'
                 
                if(resultArray[j] == ' ')
                {
                    j--;
                }
                 
                resultArray[j] = inputStringArray[i];
                 
                j--;
            }
        }
         
        System.out.println(inputString+" ---> "+String.valueOf(resultArray));
    }
     
    public static void main(String[] args)
    {
        reverseString("I Am Not String");
         
        reverseString("JAVA JSP ANDROID");
         
        reverseString("1 22 333 4444 55555");
    }
}
