package Operators;

public class OperatorsMain3 {
    public static void main(String[] arg){
        int a = 5;
        int b = a;

        short shortNumber = 10;
        long largeNumber = 10 + 5;
        //int number = largeNumber; //невозможно
        int number = shortNumber;

        double doubleNumber = number;
        float floatNumber = number;

        int maxVal = 2_147_483_647;
        long maxVal1 = number + maxVal;
        System.out.println(maxVal);
    }
}
