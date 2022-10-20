import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number,basValue,total=0;
        Scanner input= new Scanner (System.in);

        System.out.print("Bir sayı giriniz: ");
        number= input.nextInt();

        while(number !=0){
            basValue=number%10;
            number/=10;
            total +=basValue;
        }
        System.out.print("Basamak sayılarının toplamı= "+total);
    }
}