import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = "";
        System.out.println("Введіть 5 слів");
        for (int i = 0; i < 5; i++) {
            word = scan.next();
            System.out.println(word.substring(0, 1));
        }
    }
}
