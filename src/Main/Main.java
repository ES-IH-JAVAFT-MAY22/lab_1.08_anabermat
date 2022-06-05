package Main;

import IntLists.IntArrayList;
import IntLists.IntVector;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Rounding a decimal
        BigDecimal bigDecimal = new BigDecimal(2.4532);
        double result = round(bigDecimal);
        System.out.println(result);

        //Reverse the sign
        BigDecimal bigDecimal2 = new BigDecimal(2.4532);
        double reversedSign = reverseSign(bigDecimal2);
        System.out.println(reversedSign);

        //intArray
        int[] intArray = new int[10];
        fillArray(intArray);

        int newElement = 1;
        int[] newArray = IntArrayList.add(intArray,newElement);
        for(int i=0;i< newArray.length;i++){
            System.out.println(newArray[i]);
        }

        int[] newArray2 = IntVector.add(intArray,newElement);
        for(int i=0;i< newArray.length;i++){
            System.out.println(newArray[i]);
        }
    }

    public static double round(BigDecimal number){
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(number));
        BigDecimal rounded = bigDecimal.setScale(2, RoundingMode.HALF_EVEN);
        double result = rounded.doubleValue();
        return result;
    }

    public static double reverseSign (BigDecimal number) {
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(number));
        BigDecimal rounded = bigDecimal.setScale(2, RoundingMode.HALF_EVEN);
        double result = rounded.negate().doubleValue();
        return result;
    }

    public static void fillArray(int[] array) {
        int choice;
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Introduce la longitud del array");
        choice = scanner.nextInt();

        for (int i = 0; i < choice; i++){
            System.out.println("Introduce el número");
            number = scanner.nextInt();
            array[i]= number;
        }
        scanner.close();
    }

}
