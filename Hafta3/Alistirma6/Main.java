import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        boolean isBinary = true;
        long num = scan.nextLong();

        while(num > 0) {
            if(num % 10 > 1) {
                isBinary = false;
                break;
            }
            num /= 10;
        }

        if(isBinary) {
            System.out.println("Girilen sayı binary");
        } else {
            System.out.println("Girilen sayı binary değil");
        }

        scan.close();
    }
}