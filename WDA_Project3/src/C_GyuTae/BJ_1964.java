package C_GyuTae;

import java.util.Scanner;

public class BJ_1964 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int jum = 45678;
    int result = 5;

    for(int i = 1; i < n; i++)  {
        result = (result + (i + 2) * 3 - 2) % jum;
    }
    System.out.println(result);
    sc.close();
  }
}

