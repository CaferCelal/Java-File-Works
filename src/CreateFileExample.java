import java.io.File;

public class CreateFileExample {
    private String errorMessage = "File Already Exist";
    public void createFile(String path) {
        try {
            // Specify the file path and name
            String directoryPath = path;

            // Create a File object
            File file = new File(directoryPath);


            // Check if the directory already exists
            if (file.exists()) {
                throw new AlreadyExistException(errorMessage);
            } else {
                // Create the directory
                boolean created = file.createNewFile();
                if (created) {
                    System.out.println("File created successfully.");
                } else {
                    System.out.println("Failed to create the file.");
                }
            }

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
