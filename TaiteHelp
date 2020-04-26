import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author vince
 */
public class Taite {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String programDir = System.getProperty("user.dir");
        File file = new File(programDir + "\\store2.csv");

        BufferedReader br = new BufferedReader(new FileReader(file));
        ArrayList<String> badLines = new ArrayList<String>();

        Scanner input = new Scanner(new File("store2.csv"));
        System.out.println(input.nextLine());
        while (input.hasNextLine()) {
            String line = input.nextLine();
            String numCheck = line.replaceAll("[^0-9\\.]", ""); //check if a row contains a number value (and include periods)
            if (numCheck.length() > 0) {
                String[] goodLine = line.split(",");
                System.out.println(goodLine[0] + ", " + goodLine[1]);
            } else {
                String[] badLine = line.split(",");
                badLines.add(badLine[0].replaceAll("\"", ""));
            }
        }
        input.close();
        System.out.println(badLines);

        try {
            FileWriter output = new FileWriter("C:\\Users\\vince\\Desktop\\badLines.txt", false);
            for (int i = 0; i < badLines.size(); i++) {
                output.write(badLines.get(i));
                output.write("\n");
            }
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.out.println(goodLines);
//        System.out.printf("Avg: $%.2f%n", 115.17667456456456456);
//
//        /*You can also add a \\s* at the beginning and end to remove trailing whitespace. The * getting all whitespace, not just one*/
//        String[] values = lines.get(0).split(",");
//        
//        ArrayList list = new ArrayList(Arrays.asList(values));
//        System.out.println(list);
//        String a = list.get(0).toString();
//        System.out.println(a.length());
//        System.out.println(list.get(0).toString().charAt(0));
//
//        StringTokenizer tokenizer = new StringTokenizer(lines.get(0), ",");
//        while (tokenizer.hasMoreTokens()) {
//            System.out.println(tokenizer.nextToken());
//        } 
    }
}
