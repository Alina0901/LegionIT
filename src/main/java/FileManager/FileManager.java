package FileManager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

  
    public void writeToFile(String fileName, String text){
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error! Cannot write...");
            e.printStackTrace();
        }
    }
}
