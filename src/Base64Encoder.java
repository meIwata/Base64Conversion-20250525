import java.util.Base64;
import java.util.Scanner;

public class Base64Encoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入要轉換的字串：");
        String input = scanner.nextLine();

        // 字串轉成 Base64
        String encoded = Base64.getEncoder().encodeToString(input.getBytes());
        System.out.println("Base64 編碼結果：" + encoded);
    }
}