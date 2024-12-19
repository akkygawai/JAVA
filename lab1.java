import java.io.*;
import java.util.Scanner;
class lab1
{
    public static void main (String args[]){
        double radius,area,circumference;
        final double pi=3.142;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter radius of a circle");
        radius=obj.nextFloat();
        area=pi*(radius*radius);
        circumference=2*pi*radius;
        System.out.println("Area of circle="+area);
        System.out.println("\n circumference of circle="+circumference);

    }
   
}