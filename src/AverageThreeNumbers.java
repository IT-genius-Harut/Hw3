import java.util.Scanner;

public class AverageThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextInt();
        double number1 = scanner.nextInt();
        double number2 = scanner.nextInt();
        double average = getAverage(number, number1, number2);
        System.out.println("average is: " + average);
    }

    public static double getAverage(double number1, double number2, double number3) {
        return (number1 + number2 + number3) / 3;
    }
}

