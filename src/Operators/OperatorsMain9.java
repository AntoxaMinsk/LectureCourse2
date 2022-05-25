package Operators;

public class OperatorsMain9 {
    public static void main(String[] arg){
        boolean existPelmeni = true;
        boolean existSmetana = false;
        System.out.println(existPelmeni && existSmetana);
        System.out.println(existPelmeni & existSmetana);
        System.out.println(existPelmeni | existSmetana);

        int a = 10;

        System.out.println(a++ > 11 && a++ < 5);
        System.out.println(a);

        a = 10;
        System.out.println(a++ > 11 & a++ < 5);
        System.out.println(a);

    }
}