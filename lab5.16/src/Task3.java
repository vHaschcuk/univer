import java.util.Random;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 101);
        int digits = String.valueOf(number).length();
        System.out.println("Згенероване число: " + number);
        System.out.println("Кількість цифр: " + digits);
    }
}
