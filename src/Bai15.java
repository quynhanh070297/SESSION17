public class Bai15
{
    public static void main(String[] args)
    {
        // Kiem tra 3 canh cua mot hinh tam giac
        // Neu gia tri la so am hoac tong 2 canh lon hon 1 canh con lai la phat sinh ngoai le
        isNotATraingle(3,0,5);
    }
    public static void isNotATraingle (int a, int b, int c) throws Bai15IllegalTriangleException
    {
       if (a<0||b<0||c<0){
           throw new Bai15IllegalTriangleException("canh phai lon hon 0");
       }
       if (a+b<c||b+c<a||a+c<b)
       {
           throw new Bai15IllegalTriangleException("Tong cua 2 canh khong the nho hon 2 canh con lai");
       }
    }
}
