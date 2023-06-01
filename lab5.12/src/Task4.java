public class Task4 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int)(Math.random()*11);
            System.out.print(arr1[i] + " ");
        }
        System.out.println(" ");

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int)(Math.random()*11);
            System.out.print(arr2[i] + " ");
        }
        System.out.println(" ");

        int[] arr3 = new int[10];

        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = arr1[i] + arr2[i];
            System.out.print(arr3[i] + " ");
        }

        //Завдання 5
        int[] numbers = new int[15];
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random()*11);
            System.out.print(numbers[i] + " ");
            if(numbers[i] % 2 == 0){
                counter++;
            }
        }
        System.out.println("\nКількість парних елементів в масиві: " + counter);
    }
}
