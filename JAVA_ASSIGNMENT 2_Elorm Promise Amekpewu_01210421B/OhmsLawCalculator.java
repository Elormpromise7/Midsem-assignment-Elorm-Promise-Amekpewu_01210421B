import java.util.Scanner;

public class OhmsLawCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ohm's Law Calculator");
        System.out.println("Choose the unknown parameter:");
        System.out.println("1. Voltage (V)");
        System.out.println("2. Current (I)");
        System.out.println("3. Resistance (R)");
        System.out.print("Enter your choice (1, 2, or 3): ");
        int choice = scanner.nextInt();

        double voltage = 0;
        double current = 0;
        double resistance = 0;

        switch (choice) {
            case 1: // Voltage is unknown
                System.out.print("Enter Current (I) in Amperes: ");
                current = scanner.nextDouble();
                System.out.print("Enter Resistance (R) in Ohms: ");
                resistance = scanner.nextDouble();
                if (current < 0 || resistance < 0) {
                    System.out.println("Error: Current and Resistance must be non-negative.");
                    return;
                }
                voltage = current * resistance;
                System.out.printf("Calculated Voltage (V): %.2f Volts%n", voltage);
                break;

            case 2: // Current is unknown
                System.out.print("Enter Voltage (V) in Volts: ");
                voltage = scanner.nextDouble();
                System.out.print("Enter Resistance (R) in Ohms: ");
                resistance = scanner.nextDouble();
                if (voltage < 0 || resistance <= 0) {
                    System.out.println("Error: Voltage must be non-negative and Resistance must be positive.");
                    return;
                }
                current = voltage / resistance;
                System.out.printf("Calculated Current (I): %.2f Amperes%n", current);
                break;

            case 3: // Resistance is unknown
                System.out.print("Enter Voltage (V) in Volts: ");
                voltage = scanner.nextDouble();
                System.out.print("Enter Current (I) in Amperes: ");
                current = scanner.nextDouble();
                if (voltage < 0 || current <= 0) {
                    System.out.println("Error: Voltage must be non-negative and Current must be positive.");
                    return;
                }
                resistance = voltage / current;
                System.out.printf("Calculated Resistance (R): %.2f Ohms%n", resistance);
                break;

            default:
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                break;
        }

        scanner.close();
    }
}