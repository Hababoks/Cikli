import java.util.Scanner;



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.print("Введите целое число: ");
            num = scanner.nextInt();
            System.out.println("Вы ввели: " + num);
            if (num % 10 == 0 && num != 0) {
                System.out.println("Число, кратное 10, было введено: " + num);
                break;
            }
        } while (true);
        scanner.close();
    }
}




