import java.io.File;
import java.io.FileInputStream;
import java.util.Base64;

public class FileToBase64 {
    public static String encodeFileToBase64(String filePath) throws Exception {
        File file = new File(filePath);
        FileInputStream fis = new FileInputStream(file);
        byte[] fileBytes = new byte[(int) file.length()];
        fis.read(fileBytes);
        fis.close();
        return Base64.getEncoder().encodeToString(fileBytes);
    }

    public static void main(String[] args) throws Exception {
        String imgPath = "src/Documents/coke.jpg";

        System.out.println(encodeFileToBase64(imgPath));
    }
}