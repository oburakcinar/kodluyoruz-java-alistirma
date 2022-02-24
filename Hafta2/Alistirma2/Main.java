import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz ");
        int n = scan.nextInt();
        System.out.println("3 ve 7'ye tam bölünen sayilar:");
        if(n < 21) {
            System.out.print("Belirtilen aralıkta 3'e ve 7'ye tam bölünen sayı bulunmamaktadır");
        } else {
            int i = 21;
            while(i <= n) {
                System.out.print(i + ", ");
                i += 21;
            }
        }
        scan.close();
    }
}