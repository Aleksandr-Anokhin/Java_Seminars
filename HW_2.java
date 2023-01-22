// Задача 2. Вывести все простые числа от 1 до 1000

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HW_2 {
    public static void main(String[] args) { 
        Scanner iScanner = new Scanner(System.in);
            System.out.printf("Введите число от 1 до 1000: ");
            int i = iScanner.nextInt();
            iScanner.close();
            List<Integer> primes = new ArrayList<>();

            for (int x = 2; x <= i; x++) {
                boolean isPrimeNumber = true;

                for (int j = 2; j < x; j++) {
                    if (x % j == 0) {
                        isPrimeNumber = false;
                        break;
                    }
                }

                if (isPrimeNumber) {
                    primes.add(x);
                }
            }
            System.out.println("Простые числа: " + primes);
    }
}
