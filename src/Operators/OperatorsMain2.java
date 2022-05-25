package Operators;

public class OperatorsMain2 {
    public static void main(String[] arg){
        int a = 5;
        int b = 10;
        int c = a / b;
        double z = a / b;
        System.out.println(c);
        System.out.println(z);
        //int v = 5.0 / 10; // not correct
        double v = 5.0 / 10;
        v = 5. / 10;
        v = .5 / 10;
        v = 5d / 10;
        v = (double) a / b;
        System.out.println(v);
    }
}
