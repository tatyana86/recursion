import java.util.*;
import java.io.File;

public class Main {

    public static ArrayList<File> allFilesDir(String pathName) {
        File dir = new File(pathName);
        ArrayList<File> allFiles = new ArrayList<>();
        ArrayList<File> expand = new ArrayList<>();
        expand.addAll(Arrays.asList(dir.listFiles())); 

        for(File file : expand) {
            if(file.isDirectory()) {
                allFiles.addAll(allFilesDir(String.valueOf(file)));
            }
            if(! file.isDirectory()) {
                allFiles.add(file);
            }
        }

        return allFiles;
    }


}