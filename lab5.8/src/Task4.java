public class Task4 {
    public static void main(String[] args) {
        String choice = "Yes";

        switch (choice){
            case "Так":
            case "OK":
            case "Yes":
            case "Y":
            case "+":
            case "Ok":
                System.out.println("Я погоджуюсь!");
                break;
            case "Ні":
            case "NO":
            case "N":
            case "-":
            case "No":
                System.out.println("Я відмовляюсь!");
                break;
        }
    }
}
