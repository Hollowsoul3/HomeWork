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
        int b = 1;
        while (n <= 1000000) {
            System.out.println("День " + b + ": " + n);
            n = 1 + n * 3;
            b++;
        }
    }
}
