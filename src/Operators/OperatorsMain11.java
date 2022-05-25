package Operators;

public class OperatorsMain11 {
    public static void main(String[] arg){
        boolean existPelmeni = true;
        boolean existSmetana = false;
        if(existPelmeni){
            if(existSmetana){
                System.out.println("Покупаем всё");
            } else {
                System.out.println("Ай");
            }
        }else {
            System.out.println("Ай");
        }
    }
}