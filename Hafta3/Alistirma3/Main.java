import java.util.Scanner;

public class Main {
	
	public static int fib(int n) {
        if ((n == 0) || (n == 1))
           return n;
        else
           return fib(n - 1) + fib(n - 2);
     }

     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = scan.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print(fib(i) + " ");
        }

        scan.close();
     }
	  
}