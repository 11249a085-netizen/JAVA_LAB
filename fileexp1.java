import java.io.FileWriter;
import java.io.IOException;
public class fileexp1 {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("file1.txt")) {
            writer.write("BANKAI! KANNO BIRAKI BERIHIME ARATAME " + //
                                "\nWake up to reality! " + //
                                "\nNothing ever goes as planned in this accursed world." + //
                                "\nThe longer you live, the more you will realize " + //
                                "\nThat the only things that truly exist in this reality are merely pain, suffering, and futility.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
