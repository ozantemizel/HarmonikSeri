import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz.");
        int number = input.nextInt();
        double result=0;

        for(int i=1; i<=number;i++){
            result+=(1.0/i);
        }


        System.out.println(result);
    }
}
