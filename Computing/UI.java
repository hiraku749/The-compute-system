import java.math.BigDecimal;
import java.util.Scanner;
import java.io.IOException;
public class UI {
    Scanner sc = new Scanner(System.in);
    Compute compute = new Compute();
    Memory memory = new Memory();
    BigDecimal i = BigDecimal.ZERO;
    public void print(String number) throws IOException {
      boolean continueor = true;
      while (continueor) {
      System.out.print("計算したい数字を入力してください");
      
      if (memory.getmemory() == 0) {
        i = sc.nextBigDecimal();
      sc.nextLine();
      } else {
        i = memory.getResult();
        System.out.print("前回の内容を引き継ぎます");
      }
      System.out.print("どの計算をしたいですか？");
      System.out.print("1:引き算 2:足し算 3: 割り算 4:掛け算 5: 二乗");
      int or = sc.nextInt();
      sc.nextLine();
      switch (or) {
        case 1:
          System.out.print("引きたい数を教えてください(複数入力可)");
          sc.nextLine();
          String numbers1 = sc.nextLine();
          BigDecimal result1 = compute.Subtraction(numbers1, i);
          System.out.println(
            result1.stripTrailingZeros().toPlainString()
          );
          memory.setResult(result1);
          break;
        case 2:
          System.out.print("足したい数を教えてください(複数入力可)");
          sc.nextLine();
          String numbers2 = sc.nextLine();
          BigDecimal result2 = compute.Add(numbers2, i);
          System.out.println(
            result2.stripTrailingZeros().toPlainString()
          );
          memory.setResult(result2);
          break;
        case 3:
          System.out.print("割りたい数を教えてください(複数入力可)");
          sc.nextLine();
          String numbers3 = sc.nextLine();
          System.out.print("下千桁しか扱いません");
          BigDecimal result3 = compute.division(numbers3, i);
          System.out.println(
            result3.stripTrailingZeros().toPlainString()
          );
          memory.setResult(result3);
          break;
        case 4:
          System.out.print("掛けたい数を教えてください(複数入力可)");
           sc.nextLine();
          String numbers4 = sc.nextLine();
          BigDecimal result4 = compute.Multiplication(numbers4, i);
          System.out.println(
            result4.stripTrailingZeros().toPlainString()
          );
          memory.setResult(result4);
          break;
        case 5:
          System.out.print("何回二乗しますか？");
          sc.nextLine();
          int number5 = sc.nextInt();
          BigDecimal result5 = compute.squared(number5, i);
          System.out.println(
            result5.stripTrailingZeros().toPlainString()
          );
          memory.setResult(result5);
          break;
      }
      System.out.print("計算結果を保存し、続けますか？ yes or no");
      sc.nextLine();
      String continueChoice = sc.nextLine();
      if (continueChoice.contains("yes")) {
        continueor = true;
      } else {
        System.out.print("終了します");
        continueor = false;
        break;
      }
      }

    }
    
    public static void main(String[] args) throws IOException {
        UI ui = new UI();
        ui.print("");
    }
}