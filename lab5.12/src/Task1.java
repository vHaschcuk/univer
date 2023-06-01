public class Task1 {
    public static void main(String[] args) {
        //Завдання 1
        int odd [] = new int [50];
        for(int i = 1, j = 0; i <= 99; i++){
            if(i%2 != 0){
                odd[j] = i;
                System.out.println(odd[j] + "");
                j++;
            }
        }
    }
}