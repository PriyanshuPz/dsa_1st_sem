import java.util.Scanner;

public class Hw {

    public static void main(String[] args) {
        armstrong();
    }

    public static void armstrong() {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int temp = num;
        int digits = 0;

        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;

            int power = Math.powExact(digit, digits);

            // for (int i = 1; i <= digits; i++) {
            // power = power * digit;
            // }

            sum = sum + power;
            temp = temp / 10;
        }

        if (sum == num) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }

    public static void rotate() {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int k = sc.nextInt();

        int temp = num;
        int digits = 0;

        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        k = k % digits; // final rot val

        int power = 1;

        for (int i = 1; i <= digits - k; i++) {
            power = power * 10;
        }

        int first = num / power;
        int remaining = num % power;

        int multiplier = 1;

        for (int i = 1; i <= k; i++) {
            multiplier = multiplier * 10;
        }

        int result = remaining * multiplier + first;

        System.out.println(result);
    }
}
