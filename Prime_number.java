import java.util.Scanner;

public class Prime_number {
    static boolean isPrime(int num){
        if(num == 0 || num ==1){
            return false;
        }
        for(int i=2 ; i<Math.sqrt(num); i++){
            if(num%i == 0) return false;
        }

        return true;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        boolean check_prime = isPrime(num);
        String message = check_prime ? "prime Number" : "Not prime Number";
        System.out.println(message);
        
    }
}
