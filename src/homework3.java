public class homework3 {
    public static void main(String[] args) {


        for (int i = 1; i <= 100; i++) {
            if (!Integer.toString(i).contains("4") && !Integer.toString(i).contains("9")) {
                System.out.println(i);
            }
        }


        //Задача 23
        int n = 1;
        int i = 0;

        for (int sum = 1; sum <= 1000000; sum += n) {
            n = 3 * n;
            System.out.println(sum);
            i++;
        }
        System.out.println("Дней: " + i);
    }
}

