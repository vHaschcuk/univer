import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        //Завдання 1
        String str1 = "";
        String str2 = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть 5 слів");
        for (int i = 0; i < 5 ; i++) {
            str2 = sc.next();
            str1 = str1.concat(str2 + " ");
        }
        System.out.println(str1);
    }
}