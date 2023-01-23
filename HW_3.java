import java.util.Scanner;

public class HW_3 {
    public static void main(String[] args) {
        double num1;
        double num2;
        double ans;
        char op;
        try (Scanner reader = new Scanner(System.in)) {
            System.out.print("Введите через пробел два числа: ");
            num1 = reader.nextDouble();
            num2 = reader.nextDouble();
            System.out.print("\nВведите один из операторов (+, -, *, /): ");
            op = reader.next().charAt(0);
        }
        switch(op) {
           case '+': ans = num1 + num2;
              break;
           case '-': ans = num1 - num2;
              break;
           case '*': ans = num1 * num2;
              break;
           case '/': ans = num1 / num2;
              break;
           default:  System.out.printf("Ошибка ввода, попробуйте ещё раз.");
              return;
        }
        System.out.print("\nРезультат:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
        System.out.print(' ');  // Пустая срока как разделитель
        System.out.print("\nПовторить - 1; Завершить - 0.\n");  // Пользователю предлагается выбыр, что делать дальше.
        // Непонятно, как связать этот выбор с функцией.
    }
    /* 
    public static int choosingAnAction(int e) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Выберите действие: ");
        int e = iScanner.nextInt();
            if (e == 0) {
                System.exit(0);
            }
            if (e == 1) {
                // Здесь по должен быть вызов программы с начала, но непонятно что именно сюда записать
            }
    }
    */    
}
