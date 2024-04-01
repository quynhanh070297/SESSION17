import java.util.Arrays;
import java.util.Scanner;

public class Bai2
{
    // Tim so lon n hat trong mang so neu mang rong thi nem ra ngoai le throw
    public static void main(String[] args)
    {
        // Runtime E
        //B1 : Khai bao bien va nhap du lieu
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap vao so phan tu cua mang");
        int inputElement = Integer.parseInt(scanner.nextLine());
        //B2 : Kiem tra mang rong
        isEmptyArr(inputElement);
        int[] arrNum = new int[inputElement];

        for (int i = 0; i < arrNum.length; i++)
        {
            arrNum[i] = (int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(arrNum));
        //B3 : Tim so lon nhat
        int max = arrNum[0];
        for (int i = 1; i < arrNum.length; i++)
        {
            if (max<arrNum[i]){
                max= arrNum[i];
            }

        }
        //B4 : In hoac thong bao loi
        System.out.println("So lon nhat la :" + max);

    }
    public static void isEmptyArr(int inputElement)throws Bai2IsEmpty{
        if (inputElement==0){
            throw new Bai2IsEmpty("Mang rong roi em");
        }
    }
}
