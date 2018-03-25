package ch01;

import java.math.BigInteger;
import java.util.Scanner;

public class HomeWork {

   public static void q1() {
      Scanner var0 = new Scanner(System.in);
      System.out.println("your input for q1?");
      int var1 = var0.nextInt();
      System.out.printf("%d, %o, %x, %s, %a\n", new Object[]{Integer.valueOf(var1), Integer.valueOf(var1), Integer.valueOf(var1), Integer.toString(var1, 2), Double.valueOf(1.0D / (double)var1)});
   }

   public static void q2() {
      Scanner var0 = new Scanner(System.in);
      System.out.println("your input for q2?");
      int var1 = var0.nextInt();
      System.out.printf("%d\n", new Object[]{Integer.valueOf(var1 % 360)});
   }

   public static void q3() {
      Scanner var0 = new Scanner(System.in);
      System.out.println("your input for q3?");
      int var1 = var0.nextInt();
      int var2 = var0.nextInt();
      int var3 = var0.nextInt();
      int var4 = var3;
      if(var3 < var2) {
         var4 = var2;
      }

      if(var4 < var3) {
         var4 = var3;
      }

      System.out.printf("max is %d\n", new Object[]{Integer.valueOf(var4)});
      int var5 = Math.max(var1, var2);
      var5 = Math.max(var5, var3);
      System.out.printf("max is %d\n", new Object[]{Integer.valueOf(var5)});
   }

   public static void q4() {
      System.out.println(Double.MAX_VALUE);
      System.out.println(Double.MIN_VALUE);
   }

   public static void q5() {
      double var0 = 3.0E9D;
      int var2 = (int)var0;
      System.out.println(var2);
   }

   public static void q6() {
      Scanner var0 = new Scanner(System.in);
      System.out.println("input n for q6?");
      int var1 = var0.nextInt();
      if(var1 >= 0) {
         if(var1 == 0) {
            System.out.println(1);
         }

         BigInteger var2 = new BigInteger("1");

         for(int var3 = 1; var3 < var1; ++var3) {
            BigInteger var4 = new BigInteger(Integer.toString(var3));
            var2 = var2.multiply(var4);
         }

         System.out.println(var2);
      }
   }

   public static void main(String[] var0) {
      q6();
   }
}
