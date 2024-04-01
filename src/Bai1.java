import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Bai1
{ // Tinh tong so nguyen
    public static void main(String[] args)
    {
        // B1 : Khai bao hai bien so nguyen de luu hai gia tri so

        int intergerNum1;
        int intergerNum2;
        Scanner scanner = new Scanner(System.in);
        // B2 : Lap cho de khi nhap dung
        System.out.println("moi ban nhap 1 so nguyen");

        while (true){
            try
            {
                intergerNum1 = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("Nhap vao mot so nguyen");
            }catch (Exception f){
                System.out.println("Loi ");
            }
        }
        System.out.println("moi ban nhap 1 so nguyen");
        while (true){
            try
            {
                intergerNum2 = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("Nhap vao mot so nguyen");
            }catch (Exception f){
                System.out.println("Loi ");
            }
        }

        // B3 : Tinh tong va hien thi ket qua
        System.out.println("Tong cua 2 so nguyen la : " + (intergerNum2+intergerNum1));
    }
}
