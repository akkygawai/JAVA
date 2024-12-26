
    public class overload
{
    public int sum (int x,int y)
    {
        return( x + y );
    }
    
    public int sum(int x,int y, int z)
    {
        return ( x + y + z );
    }

    public double sum( double x , double y )
    {
        return ( x + y );
    }
}
class overloadtest
{ public static void main(String[] args) {
        overload o1 =new overload();
        System.out.println(o1.sum(10,20));
        System.out.println(o1.sum(10,20,30));
        System.out.println(o1.sum(10.5,20.5)); } }
