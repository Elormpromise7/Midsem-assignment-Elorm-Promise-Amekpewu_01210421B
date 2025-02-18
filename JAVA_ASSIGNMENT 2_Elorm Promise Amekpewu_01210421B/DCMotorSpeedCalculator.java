import java.util.Scanner;

public class DCMotorSpeedCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Voltage
        System.out.print("Enter the input voltage (V): ");
        double voltage = scanner.nextDouble();

        // Input: Back EMF
        System.out.print("Enter the back electromotive force (EMF) (V): ");
        double backEMF = scanner.nextDouble();

        // Input: Motor Constant
        System.out.print("Enter the motor constant (K) (V/RPM): ");
        double motorConstant = scanner.nextDouble();

        // Validate inputs
        if (motorConstant <= 0) {
            System.out.println("Error: Motor Constant must be a positive value.");
            return;
        }

        if (voltage <= 0) {
            System.out.println("Error: Voltage must be a positive value.");
            return;
        }
        if (backEMF < 0) {
            System.out.println("Error: Back EMF cannot be negative.");
            return;
        }

        // Calculate speed in RPM
        double speedRPM = (voltage - backEMF) / motorConstant;

        // Validate calculated speed
        if (speedRPM < 0) {
            System.out.println("Error: Calculated speed cannot be negative.");
            return;
        }

        // Output: Display the calculated speed
        System.out.printf("The calculated speed of the DC motor is: %.2f RPM%n", speedRPM);
    }
}
