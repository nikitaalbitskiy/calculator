import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        String input = gettingString();
        int result = 0;
        if (!(Character.isDigit(input.charAt(0)))) {
            int n1, n2;
            int res = 0;
            String fres;
            n1 = RomanianNums.beginning(input);
            n2 = RomanianNums.ending(input);
            res = caly(n1, n2, res, input);
            fres = RomanianNums.transl(res);
            System.out.println("Результат: " + fres);
        } else {
            result = caly(num1(input), num2(input), result, input);
            System.out.println("Результат: " + result);
        }
    }

    public static String gettingString() {
        System.out.println("Введите выражение:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int num1(String inp) {
        String[] i = inp.split("[+*/-]");//массив чисел
        return Integer.parseInt(i[0]);
    }

    public static int num2(String inp) {
        String[] i = inp.split("[+*/-]");
        return Integer.parseInt(i[1]);
    }

    public static int caly(int x, int y, int res, String inp) {
        if (1 >= x || y <= 10) {
            if (inp.contains("+")) {
                res = x + y;
            } else if (inp.contains("-")) {
                res = x - y;
            } else if (inp.contains("*")) {
                res = x * y;
            } else if (inp.contains("/")) {
                res = x / y;
            } else {
                System.out.println("Вы ввели неверное выражение");
            }
        } else {
            System.out.println("Введите числа от 1 до 10");
        }
        return res;
    }
}
