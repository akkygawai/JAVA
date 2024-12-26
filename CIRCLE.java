import java.util.Scanner;
public class CIRCLE 
{
    public static void main(String args[])
    {
        double r,pi=3.142,area,cir;
        Scanner obj=new Scanner(System.in);
        System.out.print("ENTER THE RADIUS:");
        r=obj.nextDouble();
        area=pi*r*r;
        cir=2*pi*r;
        System.out.println("AREA OF CIRCLE = "+area);
        System.out.println("CIRCUMFERENCE OF CIRCLE = "+cir);
    }
}
