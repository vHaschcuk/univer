import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double num1, num2, num3, maxNum;

        System.out.print("Введіть перше дробове число: ");
        if(scan.hasNextDouble()){
            num1 = scan.nextDouble();
            System.out.print("Введіть друге дробове число:");
            if(scan.hasNextDouble()){
                num2 = scan.nextDouble();
                System.out.print("Введіть третє дробове число: ");
                if(scan.hasNextDouble()){
                    num3 = scan.nextDouble();
                    maxNum = num1;
                    if (num2 > maxNum){
                        maxNum = num2;
                    }

                    if (num3 > maxNum){
                        maxNum = num3;
                    }
                    System.out.println("Найбільше дробове число: " + maxNum);
                } else {
                    System.out.println("Ви ввели не дробове число");
                }
            } else {
                System.out.println("Ви ввели не дробове число");
            }
        } else {
            System.out.println("Ви ввели не дробове число");
        }
    }
}
