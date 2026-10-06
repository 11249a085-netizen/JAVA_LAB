import java.io.File;
public class fileexp3 {
    
    public static void main(String[] args) {
        File myFile = new File("example.txt");
        if (myFile.delete()) {
            System.out.println("Deleted the file: " + myFile.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}

