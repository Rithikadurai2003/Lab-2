import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter annual income: ");
        double income = scanner.nextDouble();

        double tax = calculateTax(income);

        System.out.println("Name: " + name);
        System.out.println("Income Tax: ₹" + tax);
    }

    public static double calculateTax(double income) {
        if (income <= 250000) {
            return 0;
        } else if (income <= 500000) {
            return (income - 250000) * 0.10;
        } else if (income <= 1000000) {
            return 30000 + (income - 500000) * 0.20;
        } else {
            return 50000 + (income - 1000000) * 0.30;
        }
    }
}