public class Main {
    
    public static void main(String[] args) {
        System.out.print("2, ");

        boolean isPrime = true;

        for(int i = 3; i <= 1000000; i+= 2) {
            for(int j = 3; j <= i/2; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.print(i + ", ");    
            }
            isPrime = true;
        }    
    }
}