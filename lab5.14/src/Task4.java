import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String st1, st2 = "";

        System.out.println("Вкажіть перше ім'я");
        st1 = input.next();
        System.out.println("Вкажіть друге ім'я");
        st2 = input.next();

        if(st1.equalsIgnoreCase(st2)){
            System.out.println("Імена ідентичні");
        } else {
            System.out.println("Імена не ідентичні");
        }
    }
}
