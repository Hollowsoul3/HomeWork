import java.util.Random;

public class adad {
    public static void main(String[] args) {  //Задача 30
        int [] team1=new int[25];
        int [] team2=new int[25];
        int sum1=0;
        int sum2=0;
        Random rn=new Random();
        for(int i=0;i<team1.length && i<team2.length;i++) {
            team1[i]=rn.nextInt(60);
            team2[i]=rn.nextInt(60);
            sum1 = (sum1 + team1[i]);
            sum2 = (sum2 + team2[i]);
        }
        int as=sum1/team1.length;
        int as2=sum2/team2.length;
        System.out.println(as);
        System.out.println(as2);
        if (as > as2) {
            System.out.println("средний возраст 1 команды больше");
        }
        if (as < as2) {
            System.out.println("средний возраст 2 команды больше");
        }
        if (as == as2) {
            System.out.println("средний возраст команд равен");
        }


        /*
        int[] A={2,3,0,5,7,0};  //   Задача 32  Не знаю как сделать без использования второго массива
        int[] B=new int[A.length];
        for(int i=0;i<A.length;i++) {
            if (A[i] == 0) {
                B[j] = A[i];
                System.out.println(B[i]);
            }
        }
            for(int j=0;j<A.length;j++){
                if(A[j]!=0)
                System.out.println(B[j]=A[j]);
            }
            */


        /*Random rn=new Random();   //Задача 28
        int [] A=new int[10];
        int max=A[0];
        for(int i=0;i<A.length;i++){
            A[i]=rn.nextInt(101);
            System.out.println(A[i]);
            if(A[i]>max){
                max=A[i];
            }
        }
        System.out.println("Убийца: "+max);
        }
        */


        int[] footballteam = new int[10];   //Задача 29
        Random rn1 = new Random();
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < footballteam.length; i++) {
            footballteam[i] = rn1.nextInt(20);
            if (i % 2 == 0) {
                evenSum += footballteam[i];
            } else {
                oddSum += footballteam[i];
            }
        }
        System.out.println(evenSum - oddSum);
    }
}
