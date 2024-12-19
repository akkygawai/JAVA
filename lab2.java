import java.io.*;
import java.lang.String;
class lab2{
    public static void main(String[] args) {
        String s1,s2;
        s1="Manjunath";
        s2="Vijay";
        System.out.println("======================================");
        System.out.println("given strings are:"+s1+"and"+s2);
        System.out.println("=====================================");
        System.out.println();
        System.out.println("String length");
        System.out.println("********************************************");
        int len=s1.length();
        System.out.println("length of string s1 is :"+len);
        System.out.println();
        System.out.println("string condition");
        System.out.println("---------------------------------------------");
        System.out.println(s1+"is stronger than"+s2);
        System.out.println();
        System.out.println("char extraction");
        System.out.println("---------------------------------------------");
        System.out.println("fourth character of "+s1+"is"+s1.charAt(4));
        System.out.println();
        System.out.println("comparision of s1 and s2");
        System.out.println("----------------------------------------------");
        System.out.println(s1.equals(s2));
        System.out.println();
        String s9 = "MANJUNATH";
        System.out.println("s1 equals ignore case to s9 :"+s1.equalsIgnoreCase(s9));
        int result =s1.compareTo(s9);
        System.out.println("After compareTo() ");
        if(result ==0)
        System.out.println(s1 + " is equal to "+s9);
        else if (result >0)
        System.out.println(s1 +" is greater than "+s9);
        else
        System.out.println(s1 +" is smaller than "+s9);

        System.out.println("Searching");
        System.out.println("-----------------------------------------------");
        System.out.println("t occurs at position" +s1. indexOf("t") +"in"+s1);
        System.out.println();
        System.out.println("Substring of s1");
        System.out.println("------------------------------------------------");
        System.out.println(s1.substring(0,5));
        System.out.println();
        System.out.println("replace 'M' by 'H' in s1");
        System.out.println("-----------------------------------------------");
        System.out.println(s1.replace('M', 'H'));
        System.out.println();
        System.out.println("changing s1 to uppercase");
        System.out.println(s1.toUpperCase());
        System.out.println(s1);
        System.out.println("changing s1 to lower case");
        System.out.println(s1.toLowerCase());
        String s5 ="Ashrit";  String s6 ="Shetty";  String s7;  s7 =s5.concat(s6);
        System.out.println("concatenating " +s5+ " and " +s6+ ":"+s7);
        String s8 ="  This is a book";
        System.out.println("The string s8 is :" +s8);
        System.out.println("After trim() :"+s8.trim());   
    }
}
 