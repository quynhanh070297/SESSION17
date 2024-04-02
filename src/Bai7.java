import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        // Nhap vao tu ban phim
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        // Xu ly ngoai le
        while (check){
            try {
                System.out.println("Nhap so thu nhat: ");
                int firstNumber = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhap so thu hai: ");
                int secondNumber = Integer.parseInt(scanner.nextLine());
                if (firstNumber>secondNumber){
                    System.out.println("So lon nhat la: "+firstNumber);
                }
                else {
                    System.out.println("So lon nhat la: "+secondNumber);
                }
                check = false;
            }
            catch (NumberFormatException e){
                System.err.println("Moi nhap lai");
            }
            catch (Exception x){
                System.out.println("NG");
            }
        }

    }
}