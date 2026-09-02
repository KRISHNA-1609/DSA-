// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.io.PrintStream;
import java.util.Scanner;

public class AvgOfThreeNos {
   public AvgOfThreeNos() {
   }

   public static double CalAvg(double var0, double var2, double var4) {
      return (var0 + var2 + var4) / (double)3.0F;
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter first number:");
      double var2 = var1.nextDouble();
      System.out.println("Enter second number:");
      double var4 = var1.nextDouble();
      System.out.println("Enter third number:");
      double var6 = var1.nextDouble();
      PrintStream var10000 = System.out;
      double var10001 = CalAvg(var2, var4, var6);
      var10000.println("The average of three numbers is " + var10001);
   }
}
