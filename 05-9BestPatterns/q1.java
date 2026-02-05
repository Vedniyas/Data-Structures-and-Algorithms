import java.util.Scanner;

public class q1 {
   public q1() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Rows = ");
      int var2 = var1.nextInt();
      System.out.print("Columns = ");
      int var3 = var1.nextInt();

      for(int var4 = 1; var4 <= var2; ++var4) {
         for(int var5 = 1; var5 <= var3; ++var5) {
            if (var4 != 1 && var5 != 1 && var4 != var2 && var5 != var3) {
               System.out.print(" ");
            } else {
               System.out.print("*");
            }
         }

         System.out.println();
      }

   }
}

