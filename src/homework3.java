public class homework3 {
    public static void main(String[] args) {
        /*
        Задача 24
        for(int i=1;i<=100;i++) {
            if(!Integer.toString(i).contains("4") && !Integer.toString(i).contains("9")){
                System.out.println(i);
            }
        }
        */

        double n = 1;     //Задача 23
        int b = 0;
        while (n <= 1000000) {
            n = 1 + n * 3;
            b++;
        }
        System.out.println("Дней: " + b);
    }
}
