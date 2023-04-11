import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начальное число (start): ");
        int start = scanner.nextInt();

        System.out.print("Введите конечное число (end): ");
        int end = scanner.nextInt();

        System.out.print("Введите множитель (multiple): ");
        int multiple = scanner.nextInt();

        int sum = 0;
        for (int i = start; i < end; i++) {
            if (i % multiple != 0) {
                continue;
            }
            sum += i;
        }

        System.out.println("Сумма чисел от " + start + " до " + end + " кратных " + multiple + " равна: " + sum);
    }
}