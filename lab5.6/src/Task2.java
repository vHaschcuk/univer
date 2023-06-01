public class Task2 {
    public static void main(String[] args) {
        int num = 54;
        if (num >= 10 && num <= 99) {
            int e = num % 10;
            int f = (num / 10) % 10;
            System.out.println(" Сума цифр числа дорівнює" + (e+f));
        }
    }
}
