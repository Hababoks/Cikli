import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        if (inputNumber <= 0) {
            System.out.println("Программа завершена. Введенное число должно быть больше 0.");
            return;
        }

        int count;
        for (count = 1; ; count++) {
            int randomNumber = new Random().nextInt(inputNumber + 1);
            if (inputNumber == randomNumber) {
                System.out.println("Попытка №" + count);
                break;
            }
        }
    }
}

