import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 *
 * @author Vincent
 */
public class ZipInputStream_JavaTutorial {

    public static void main(String[] args) {
        Unzipper uz = new Unzipper("C:/Users/" + System.getProperty("user.name") + "/desktop/YourZipFileHere", "C:/Users/" + System.getProperty("user.name") + "/desktop");
    }

    private static class Unzipper {

        public Unzipper(String in, String out) {
            if (out == null) {
                out = "";
            } else {
                out += File.separator;
            }
            File outputDirectory = new File(out);
            if (outputDirectory.exists()) {
                outputDirectory.delete();
            }
            outputDirectory.mkdir();
            try {
                ZipInputStream zip = new ZipInputStream(new FileInputStream(in));
                ZipEntry contents = null;
                int len;
                byte[] buffer = new byte[1024];
                while ((contents = zip.getNextEntry()) != null) {
                    if (!contents.isDirectory()) {
                        System.out.println("-" + contents.getName());
                        File file = new File(out + contents.getName());
                        if (!new File(file.getParent()).exists()) {
                            new File(file.getParent()).mkdirs();
                        }
                        FileOutputStream outStream = new FileOutputStream(file);
                        while ((len = zip.read(buffer)) > 0) {
                            outStream.write(buffer, 0, len);
                        }
                        outStream.close();
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
