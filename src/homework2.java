import java.util.Scanner;

public class homework2 {
    public static void main(String[] args){
        System.out.println("1 - налево пойдешь, сам умрешь, 2. Направо - коня потеряешь, 3. Прямо - клад найдешь");
        try (Scanner sc = new Scanner(System.in)){
            int a=sc.nextInt();
            f1(a);
            double b=sc.nextDouble();
            double c=sc.nextDouble();
            double h=sc.nextDouble();
            double m=sc.nextDouble();
            System.out.println(f2(b,c,h,m));
        }
    }
    public static void f1(int a){
        if(a==1){
            System.out.println("Умер");
        }
        if(a==2){
            System.out.println("Потерял коня");
        }
        if(a==3){
            System.out.println("Нашел клад");
        }
    }
    public static boolean f2(double b,double c,double h,double m){
        if(b<=1 && c<=1 && m<=1){
            return true;
        }
        else if(h<=1 && c<=1 && m<=1){
            return true;
        }
        else if(b<=1 && h<=1 && m<=1){
            return true;
        }
        else{
            return false;
        }
    }
}
