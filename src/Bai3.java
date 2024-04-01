import javax.sound.midi.Soundbank;

public class Bai3
{
    // Tinh tong mot mang so nguyen
    public static void main(String[] args)
    {
        //B1 : Tao mang chuoi
        String[] arrString = {"1", "a","1", "a","1", "a","1", "a","6", "a","1", "a"};
        //B2 : Neu chuoi trong mang khong phai so nguyen thi bo qua
        int sum = 0;
        for (int i = 0; i < arrString.length; i++)
        {
            try
            {
                sum += Integer.parseInt(arrString[i]);

            }catch (NumberFormatException e){
                System.out.println("Day khong phai 1 so");
            }
            catch (Exception x){
                System.out.println("NG");
            }
        }

        //B3 : In ra tong

        System.out.println("Tong so nguyen trong man la " + sum);
    }
    // tu dinh nghia EX
    public static void isNotANumber (String num) throws Bai3IsnotNumber
    {
        try
        {
            Integer.parseInt(num);
        } catch (NumberFormatException e)
        {
            throw new Bai3IsnotNumber(" Is not a number");
        }
    }
}
