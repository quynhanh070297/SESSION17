import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai4
{
    // Chuyen doi mot chuoi ve so nguyen
    // Neu khong phai so nguyen thay the so do bang 0

    public static void main(String[] args)
    {
        // B1 : Tao mot bien String
        String inputString = "234ad56bsdkb";
        // B2 : Tao mot List so nguyen
        List<Integer> integerList = new ArrayList<>();
        // B3 : Duyet chuoi ep kieu ve Integer, dat trong khoi try Catch
        for (int i = 0; i < inputString.length(); i++)
        {
          try
          {
              String num = String.valueOf(inputString.charAt(i));
              integerList.add(Integer.parseInt(num));
          }catch (NumberFormatException e){
              integerList.add(0);

          }

        }

        System.out.println(integerList);
    }
}
