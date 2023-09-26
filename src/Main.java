public class Main {

    public static void main(String[] args) {
        String sampleDirectoryPath = "C:\\Users\\Cafer Celal Evrenüz\\Desktop\\myDirectory";
        CreateDirectoryExample createDirectory = new CreateDirectoryExample();
        createDirectory.createDirectory(sampleDirectoryPath);

        String sampleFilePath = "C:\\Users\\Cafer Celal Evrenüz\\Desktop\\myDirectory\\myFile.py";
        CreateFileExample createFile = new CreateFileExample();
        createFile.createFile(sampleFilePath);

        WriteToFile fileWriter = new WriteToFile();
        fileWriter.write(sampleFilePath,"Hello World");

        OverrideToFile overrider = new OverrideToFile();
        overrider.override(sampleFilePath,"Hello Mars");

    }
}