import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64ToFile {
    public static void decodeBase64ToFile(String base64Str, String outputPath) throws Exception {
        byte[] decodedBytes = Base64.getDecoder().decode(base64Str);
        FileOutputStream fos = new FileOutputStream(outputPath);
        fos.write(decodedBytes);
        fos.close();
    }

    public static void main(String[] args) throws Exception {
        String base64String = new String(Files.readAllBytes(Paths.get("src/Documents/base64.txt")), StandardCharsets.UTF_8);
        // 清除所有換行、空白
        base64String = base64String.replaceAll("\\s", "");
        // 若有 data: 前綴，要去掉
        if (base64String.contains(",")) {
            base64String = base64String.substring(base64String.indexOf(",") + 1);
        }
        String outputPath = "src/Documents/output.jpg";
        decodeBase64ToFile(base64String, outputPath);
    }
}