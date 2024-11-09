import java.util.Scanner;
public class IT24104130Lab3Q1A {
public static void main (String [] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the price of 1kg: ");
double kilogramPrice = scanner.nextDouble();
System.out.println("Enter the number of kilograms you want to buy: ");
double quantity = scanner.nextDouble();
double total_amount = kilogramPrice * quantity;
System.out.println("The total amount you have to pay is: " +total_amount);
                   }
       }
