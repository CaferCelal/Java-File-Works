import java.io.File;
import java.io.IOException;

public class CreateDirectoryExample {
// create a directory
    private String errorMessage= "Directory already exist.";
    public void createDirectory(String path) {
        try {
            // Specify the file path and name
            String directoryPath = path;

            // Check if the file already exists
            File directory = new File(directoryPath);

            // Check if the directory already exists
            if (directory.exists()) {
                throw new AlreadyExistException(errorMessage);
            } else {
                // Create the directory
                boolean created = directory.mkdir();
                if (created) {
                    System.out.println("Directory created successfully.");
                } else {
                    System.out.println("Failed to create the directory.");
                }
            }

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}