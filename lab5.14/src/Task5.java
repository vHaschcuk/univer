import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = "";
        String string2 = "";


        System.out.println("Введіть рядок ");
        string1 = scanner.next();
        System.out.println("Введіть ще один рядок ");
        string2 = scanner.next();

        if(string1.length() > string2.length()){
            System.out.println("Перший рядок за кількістю символів більший від другого рядка");
        } else if (string2.length() > string1.length()){
            System.out.println("Другий рядок за кількістю символів більший від першого рядка");
        } else {
            System.out.println("Кількість символів у рядках рівна!");
        }
    }
}
