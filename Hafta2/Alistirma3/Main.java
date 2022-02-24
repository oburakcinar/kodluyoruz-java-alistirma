import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Alfabetik sıralamak istediğiniz kelimeleri aralarında boşluk bırakarak giriniz");
        String[] strings = scan.nextLine().split(" ");
        Arrays.sort(strings);
        System.out.println("Yeni dizilim:");
        for(String str : strings) {
            System.out.print(str + " ");
        }  
        
        scan.close();
    }
}