import java.util.Scanner;

public class Bai6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap so chia: ");
            int fisrtNumber = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhap so chia: ");
            int check = 0;
            int secondNumber = Integer.parseInt(scanner.nextLine());
            try {
                check = fisrtNumber / secondNumber;
                System.out.println("Bang" + check);
            } catch (ArithmeticException e){
                System.err.println("So chia phai khac 0");
            }
        }
    }
