import java.util.*;

public class factorial{
    public static int fact(int n){
        if(n==0 || n==1)
            return 1;
        else if (n<0) {
            System.out.println("Enter correct Number.");
            return 0;
        }
        else
            return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to find its factorial : ");
        int n = sc.nextInt();

        System.out.println(fact(n));

    }
}