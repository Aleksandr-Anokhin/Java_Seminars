/**
 * Задание 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */

import java.util.Scanner;

public class HW_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число N: ");
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", triangularNumber(i));
        System.out.printf("Факториал числа N: %d\n", calculateFactorial(i));
        iScanner.close();
    }
    public static int triangularNumber(int i) {
        return (i * (i + 1)) / 2;
    }

    public static int calculateFactorial(int i){
		int result = 1;
		for (int f = 1; f <=i; f ++){
			result = result * f;
		}
		return result;
	}	
}