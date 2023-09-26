import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public void write(String path,String message){
        String filePath = path;

        try {
            FileWriter writer = new FileWriter(filePath, true); // Open in append mode
            writer.write(message + "\n"); // Append a line to the file

            writer.close(); // Close the FileWriter
            System.out.println("Data appended to the file successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
