import java.util.Scanner;
public class IT24104130Lab3Q2 {
public static void main (String[]args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the monthly salary: ");
double monthlySalary = scanner.nextDouble();
System.out.println("Enter the number of OT hours");
double hours = scanner.nextDouble();
System.out.println("Enter the hourly rate: ");
double hourlyRate = scanner.nextDouble();
double amount = hours*hourlyRate;
double totalSalary = monthlySalary+amount;
System.out.println("The total salary is: " +totalSalary);
                }
        }
