class lab3
{
    public static void main(String[] args) {
        int n,num,count=0;
        boolean prime;
        n=Integer.parseInt(args[0]);
        num=1;
        while (count!=n)
        {
            prime = true;
            for(int j=2;j<num;j++)
            {
                if(num%j==0)
                {
                    prime = false;
                    break;
                }
            }
            if(prime)
            {
                System.out.println(num);
                count++;
            }
            num++;
            if(count ==n)
            break;
        }
    }
}

    

