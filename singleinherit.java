import java.util.Scanner;
public class singleinherit 
{ public static void main(String[] args) {
department dp=new department(); dp.department_info(); } }
class student { int rollno; String name;
Scanner sc=new Scanner(System.in);
public void student_info() {
System.out.print("enter name of a student :");
name=sc.nextLine();
System.out.print("enter roll no of a student :");
rollno=sc.nextInt(); } }
class department extends student {
String dept; Scanner sc=new Scanner(System.in);
public void department_info() {
System.out.print("enter department of student :");
dept=sc.nextLine(); student_info(); 
System.out.println("NAME ="+name);
System.out.println("ROLL NO ="+rollno);
System.out.println("DEPARTMENT ="+dept); } }

