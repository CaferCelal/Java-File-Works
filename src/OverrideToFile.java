import java.io.FileWriter;
import java.io.IOException;

public class OverrideToFile {
    public void override(String path,String message){
        String filePath = path; // Replace with your file path

        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write(message);

            writer.close(); // Close the FileWriter
            System.out.println("Data written to the file successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
