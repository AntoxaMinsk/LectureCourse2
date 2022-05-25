package Operators;

public class OperatorsMain8 {
    public static void main(String[] arg){
        boolean existPelmeni = true;
        boolean existSmetana = false;
        System.out.println(existPelmeni && existSmetana);
        System.out.println(existPelmeni || existSmetana);
        System.out.println(existPelmeni && !existSmetana);
        System.out.println(1 > 3 && (   (1 < 4) && (4 < 5)   )   );
    }
}