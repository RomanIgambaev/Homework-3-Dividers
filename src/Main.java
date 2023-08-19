import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введи значение a: ");
        int a = scanner.nextInt();

        System.out.print("Введи значение b: ");
        int b = scanner.nextInt();

        int maxNumber = a;
        int maxDivisorSum = 0;
        try {

            if (a < b) {

                for (int number = a; number <= b; number++) {
                    int divisorSum = 0;
                    for (int divisor = 1; divisor <= number / 2; divisor++) {
                        if (number % divisor == 0) {
                            divisorSum += divisor;
                        }
                    }

                    if (divisorSum > maxDivisorSum) {
                        maxDivisorSum = divisorSum;
                        maxNumber = number;
                    }
                }

                System.out.println("Число с максимальной суммой делителей: " + maxNumber);
                System.out.println("Сумма делителей этого числа: " + maxDivisorSum);
            } else {
                System.out.println("Значение а должно быть меньше b");
            }
        }catch (Exception ex) {
            System.out.println("Ты ввёл что-то не так");
        }
    }
}