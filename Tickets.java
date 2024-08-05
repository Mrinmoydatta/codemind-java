import java.util.Scanner;
public class Tickets{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int x = read.nextInt();
        if(x*4<=1000)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}