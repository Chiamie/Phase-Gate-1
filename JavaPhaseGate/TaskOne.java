import java.util.Scanner;
public class TaskOne {
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.println("Enter two integers: ");
int integer1 = input.nextInt(), integer2 = input.nextInt();

int squareOfInteger1 = integer1 * integer1;
int squareOfInteger2 = integer2 * integer2;

System.out.println("The square of integer1 is " + squareOfInteger1);
System.out.println("The square of integer2 is " + squareOfInteger2);
System.out.println("The sum of their squares is " + (squareOfInteger1 + squareOfInteger2) );
System.out.println("The difference of their squares is " + (squareOfInteger1 - squareOfInteger2));




}













}