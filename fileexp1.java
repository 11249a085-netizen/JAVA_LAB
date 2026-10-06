import java.io.FileWriter;
import java.io.IOException;
public class fileexp1 {

    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("file1.txt")) {
            writer.write("BANKAI! KANNO BIRAKI BERIHIME ARATAME");
            System.out.println("Successfully wrote into the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
