import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        // Bai 8
        Scanner scanner = new Scanner(System.in);
        int inputPrime=0;
        while (true){
            try {
                System.out.println("Nhập s0");
                inputPrime = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("Ko hợp lệ");
            }
        }
        if (isPrime(inputPrime)){
            System.out.println(inputPrime + " là nguyen to");
        }else {
            System.out.println(inputPrime + " ko la nguyen to");
        }

    }
    public static boolean isPrime(int num){
        if (num<=1){
            return false;
        }
        for (int i = 2; i <Math.sqrt(num) ; i++) {
            if (num%i==0){
                return false;
            }
        }return true;
    }
}
