import java.util.Scanner;

public class ThreeNumbersAreConsecutive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input number 1");
        int number1 = scanner.nextInt();
        System.out.println("please input number 2");
        int number2 = scanner.nextInt();
        System.out.println("please input number 3");
        int number3 = scanner.nextInt();
        boolean answer = isConsecutive(number1, number2, number3);
        System.out.println("is the number consecutive " + answer);
        System.out.println("the number is: " + number1 + " " + number2 + " " + number3);
    }

    public static boolean isConsecutive(int number1, int number2, int number3) {
        if (number1 == number2 + 1 && number1 == number3 + 2){
            return true;
        } else if (number2 == number1 + 1 && number2 == number3 - 1) {
            return true;
        } else if (number3 == number1 + 2 && number3 == number2 + 1) {
            return true;
        } return false;

    }
}
