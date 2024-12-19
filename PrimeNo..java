import java.io.*;
class primeno
{
    public static void main(String args[])
    {
        int N=args.length,i,num,J;
        boolean prime;
        for(i=0;i<N;i++)
        {
            num=Integer.parseInt(args[i]);
            prime=true;
            for(J=2;J<num;J++)
            {
                if((num%J)==0)
                {
                    prime=false;
                    break;
                }
            }
            if(prime==true)
            {
                System.out.println(num + "is prime");
            }
        }
    }
}