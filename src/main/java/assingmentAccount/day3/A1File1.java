package assingmentAccount.day3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class A1File1 {

    String FilePath = "C:\\Users\\Admin\\IdeaProjects\\repoHCL\\src\\main\\java\\assingmentAccount\\day3";

    public static void main(String[] args) {

        try {
            A1File1 obj = new A1File1();
            obj.readFileName("file.txt");
        }catch (IOException e){
            System.out.println(e);

        }
    }

    public void readFileName(String fileName) throws IOException {
        File f =new File(FilePath+"\\"+fileName);
        File f2 =new File(FilePath);
        boolean status=f.exists();
        System.out.println(status);
        status=f.createNewFile();
        System.out.println(status);

        Path path = Paths.get(FilePath);
        System.out.println(path.getParent());

    }
}
