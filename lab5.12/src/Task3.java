public class Task3 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] array3 = new int[5];
        double sum1 = 0, sum2 = 0, sum3 = 0;

        System.out.println(" ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int)(6*Math.random());
            System.out.print(array1[i] + " ");
            sum1 += array1[i];
        }
        double result1 = sum1/array1.length;
        System.out.print("Середнє значення 1-го масиву рівне " + result1);
        System.out.println(" ");

        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int)(6*Math.random());
            System.out.print(array2[i] + " ");
            sum2 += array2[i];
        }
        double result2=sum2/array2.length;
        System.out.print("Середнє значення 2-го масиву рівне " + result2);
        System.out.println(" ");

        for (int i = 0; i < array3.length; i++) {
            array3[i] = (int)(6*Math.random());
            System.out.print(array3[i] + " ");
            sum3 += array3[i];
        }
        double result3=sum3/array3.length;
        System.out.print("Середнє значення 3-го масиву рівне " + result3);
        System.out.println(" ");

        if(result1 > result2 && result1 > result3 ){
            System.out.println("Середнє значення 1-го масиву є більшим за інші");
        } else if(result2 > result1 && result2 > result3){
            System.out.println("Середнє значення 2-го масиву є більшим за інші");
        } else if(result3 > result1 && result3 > result2){
            System.out.println("Середнє значення 3-го масиву є більшим за інші");
        } else if(result1 == result1 && result2 == result3){
            System.out.println("Середні значення масивів є рівними");
        }
    }
}
