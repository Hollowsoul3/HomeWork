public class homework {
    public static void main(String[] args){
        System.out.println(f1(1,2,3)); //Задача 10
        System.out.println(f2(1,2));
        System.out.println(f3(1,2,3));
        System.out.println(f4(1,2,3));
        System.out.println(f5(1,3,5));
        System.out.println(KursValutUsd(235)); //Задача 12
        System.out.println(KursValutUah(535));
        System.out.println(earth2(1,4,1)); //Задача 13
        System.out.println(f14(123));
    }


    public static double f1(double a,double b,double c){
        double y= a + b * c / 2;
        return y;
    }
    public static double f2(double a,double b){
        double y=(Math.pow(a,2)+Math.pow(b,2))/2;
        return y;
    }
    public static double f3(double a,double b,double c){
        double y=( a + b ) / 12 * c % 4 + b;
        return y;
    }
    public static double f4(double a,double b,double c){
        double y=(a - b * c ) / ( a + b ) % c;
        return y;
    }
    public static double f5(double a,double b,double c){
        double y=Math.abs(a-b)/Math.pow(a+b,3)-Math.cos(c);
        return y;
    }
    public static double KursValutUsd(double uah) {
        double y = uah/26.0933097;
        return y;
    }
    public static double KursValutUah(double usd){
        double y=usd*26.0933097;
        return y;
    }
    public static double earth2(double day,double month,double year){
        double y=day+42*(month-1)+420*(year-1);
        return y;
    }
    public static int f14(double a){
        int y=(int)((a%10)+((a/10)%10)+(a/100));
        return y;
    }
}
