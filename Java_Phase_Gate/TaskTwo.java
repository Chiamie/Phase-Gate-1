import java.util.Scanner;
public class TaskTwo {
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.println("Enter three integers(First, Second and Third): ");
int integer1 = input.nextInt(), integer2 = input.nextInt(), integer3 = input.nextInt();

int sum = integer1 + integer2 + integer3;
int product = integer2 * integer2 * integer3;
int average = sum / 3;


int smallest = integer1;
int largest = 0;
if(integer2 > largest)
	largest = integer2;
if(integer3 > largest)
	largest = integer3;


if(integer2 < smallest)
	smallest = integer2;
if(integer3 < smallest)
	smallest = integer3;




System.out.println("The sum of the three numbers is " + sum);
System.out.println("The product of the three numbers is " + product);
System.out.println("The average of the three numbers is " + average);
System.out.println("The smallest of the three numbers " + smallest);
System.out.println("The largest of the three numbers " + largest);



}
}