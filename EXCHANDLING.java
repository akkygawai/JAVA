class authenticTest { int array[] = {10, 20, 30, 40};
int num1 = 50, num2 = 10;
public void multipleTest() { try {
System.out.println(num1/num2);
System.out.println("4th element of the given array: " + array[3]);
System.out.println("5th element of the given array: " + array[4]);}
catch (ArrayIndexOutOfBoundsException e) {System.out.println(e);} 
catch (ArithmeticException e) { System.out.println(e); }
catch (Exception e) { System.out.println(e); }  
System.out.println("Remaining Code after Exception Handling");} }
public class EXCHANDLING {
public static void main(String[] args) {
authenticTest obj = new authenticTest();
obj.multipleTest(); } }