import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir metin giriniz: ");
        String str = scan.nextLine();
        System.out.print("Ekranda metnin kaç kere gösterilmesini istersiniz? ");
        int num = scan.nextInt();
        
        while(num > 0) {
            System.out.println(str);
            num --;
        }

        scan.close();
    }
}