public class homework3 {
    public static void main(String[] args) {


        for(int i=1;i<=100;i++) {
            if(!Integer.toString(i).contains("4") && !Integer.toString(i).contains("9")){
                System.out.println(i);
            }
        }


        //Задача 23
        int sum = 0;
        int i=0;

        for(int n=1;n <= 1000000;n=3*n){
            System.out.println(sum+=n);
            i++;
        }
        System.out.println("Дней: "+i);
    }
}
