import java.util.Scanner;
public class Natural_number{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int n=read.nextInt();
        int res=n*(n+1)/2;
        System.out.println(res);
    }
}