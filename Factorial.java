//
import java.io.*;
class fact
{
    public static void main (String args[])
    {
        int N,i,num;
        long fact;
        N=Integer.parseInt (args[0]);
        for(i=1;i<=N;i++)
        {
            fact=1;
            num=i;
            while (num>=1)
            {
                fact=fact*num;
                num--;
            }
            System.out.println("FACTORIAL OF" +i+ "is" +fact);
        }

            
        
    }
}
