public class RomanianNums {
    public static int beginning(String str) {  //метод для работы с римскими цифрами, который обрабатывает
        int num = 0;
        if (str.startsWith("VIII+", 0)) {
            num = 8;
        } else if (str.startsWith("VIII-", 0)) {
            num = 8;
        } else if (str.startsWith("VIII*", 0)) {
            num = 8;
        } else if (str.startsWith("VIII/", 0)) {
            num = 8;
        } else if (str.startsWith("III-", 0)) {
            num = 3;
        } else if (str.startsWith("III+", 0)) {
            num = 3;
        } else if (str.startsWith("III*", 0)) {
            num = 3;
        } else if (str.startsWith("III/", 0)) {
            num = 3;
        } else if (str.startsWith("VII-", 0)) {
            num = 7;
        } else if (str.startsWith("VII+", 0)) {
            num = 7;
        } else if (str.startsWith("VII*", 0)) {
            num = 7;
        } else if (str.startsWith("VII/", 0)) {
            num = 7;
        } else if (str.startsWith("IV-", 0)) {
            num = 4;
        } else if (str.startsWith("IV+", 0)) {
            num = 4;
        } else if (str.startsWith("IV*", 0)) {
            num = 4;
        } else if (str.startsWith("IV/", 0)) {
            num = 4;
        } else if (str.startsWith("IX-", 0)) {
            num = 9;
        } else if (str.startsWith("IX+", 0)) {
            num = 9;
        } else if (str.startsWith("IX*", 0)) {
            num = 9;
        } else if (str.startsWith("IX/", 0)) {
            num = 9;
        } else if (str.startsWith("VI-", 0)) {
            num = 6;
        } else if (str.startsWith("VI+", 0)) {
            num = 6;
        } else if (str.startsWith("VI*", 0)) {
            num = 6;
        } else if (str.startsWith("VI/", 0)) {
            num = 6;
        } else if (str.startsWith("II-", 0)) {
            num = 2;
        } else if (str.startsWith("II+", 0)) {
            num = 2;
        } else if (str.startsWith("II*", 0)) {
            num = 2;
        } else if (str.startsWith("II/", 0)) {
            num = 2;
        } else if (str.startsWith("I-", 0)) {
            num = 1;
        } else if (str.startsWith("I+", 0)) {
            num = 1;
        } else if (str.startsWith("I*", 0)) {
            num = 1;
        } else if (str.startsWith("I/", 0)) {
            num = 1;
        } else if (str.startsWith("V-", 0)) {
            num = 5;
        } else if (str.startsWith("V+", 0)) {
            num = 5;
        } else if (str.startsWith("V*", 0)) {
            num = 5;
        } else if (str.startsWith("V/", 0)) {
            num = 5;
        } else if (str.startsWith("X-", 0)) {
            num = 10;
        } else if (str.startsWith("X+", 0)) {
            num = 10;
        } else if (str.startsWith("X*", 0)) {
            num = 10;
        } else if (str.startsWith("X/", 0)) {
            num = 10;
        } else {
            System.out.println("Введите выражение, состоящее только из двух арабских или римских цифр от 1 до 10 включительно");
        }
        return num;
    }

    public static int ending(String str) {  //метод для работы с римскими цифрами, который обрабатывает
        int num = 0;
        if (str.endsWith("VIII")) {                                           //конец строки и присваивает значение второй переменной
            num = 8;
        } else if (str.endsWith("III")) {
            num = 3;
        } else if (str.endsWith("VII")) {
            num = 7;
        } else if (str.endsWith("IV")) {
            num = 4;
        } else if (str.endsWith("VI")) {
            num = 6;
        } else if (str.endsWith("IX")) {
            num = 9;
        } else if (str.endsWith("II")) {
            num = 2;
        } else if (str.endsWith("X")) {
            num = 10;
        } else if (str.endsWith("I")) {
            num = 1;
        } else if (str.endsWith("V")) {
            num = 5;
        } else {
            System.out.println("Введите выражение, состоящее только из двух арабских или римских цифр от 1 до 10 включительно");
        }
        return num;
    }

    public static String romanianDigit(int n, String one, String five, String ten) {

        if (n >= 1) {
            if (n == 1) {
                return one;
            } else if (n == 2) {
                return one + one;
            } else if (n == 3) {
                return one + one + one;
            } else if (n == 4) {
                return one + five;
            } else if (n == 5) {
                return five;
            } else if (n == 6) {
                return five + one;
            } else if (n == 7) {
                return five + one + one;
            } else if (n == 8) {
                return five + one + one + one;
            } else if (n == 9) {
                return one + ten;
            }

        }
        return "";
    }

    public static String transl(int number) {

        String romanOnes = romanianDigit(number % 10, "I", "V", "X");
        number /= 10;
        String romanTens = romanianDigit(number % 10, "X", "L", "C");
        number /= 10;
        String romanHunds = romanianDigit(number % 10, "C", "D", "M");
        number /= 10;

        return romanHunds + romanTens + romanOnes;

    }
}