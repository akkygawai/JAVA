class A extends Thread {
public void run() {
for (int i = 1; i <= 5; i++) {
System.out.println("\t from Thread A: i = " + i); }
System.out.println("Exit From A");} }
class B extends Thread {
public void run() {
for (int j = 1; j <= 5; j++) {
System.out.println("\t from Thread B: j = " + j); }
System.out.println("Exit From B");} }
class C extends Thread {
public void run() {
for (int k = 1; k <= 5; k++) {
System.out.println("\t from Thread C: k = " + k); }
System.out.println("Exit From C"); } }
public class MULTITHREADING {
public static void main(String[] args) {
new A().start(); new B().start(); new C().start();} }
