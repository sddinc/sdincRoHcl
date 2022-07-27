package assingmentAccount.day3;

import java.io.File;
import java.io.IOException;

public class A2csvFile {
    String FilePath = "C:\\Users\\Admin\\IdeaProjects\\repoHCL\\src\\main\\java\\assingmentAccount\\day3";

    public static void main(String[] args) {

        try {
            A3File1 obj = new A3File1();
            obj.readFileName("file.txt");
        }catch (IOException e){
            System.out.println(e);

        }
    }

    public void readFileName(String fileName) throws IOException {
        File f =new File(FilePath+"\\"+fileName);
        boolean status=f.exists();
        System.out.println(status);
        status=f.createNewFile();
        System.out.println(status);

        System.out.println(f.listFiles());



    }
}
