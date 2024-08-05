import java.util.Scanner;
public class ReachHome{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int x =read.nextInt();
        int y = read.nextInt();
        if(5*x >= y)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}