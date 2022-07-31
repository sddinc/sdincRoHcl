package assingmentAccount.day3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class A2csvFile {
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
        boolean status=f.exists();
        System.out.println(status);
        status=f.createNewFile();
        System.out.println(status);

        System.out.println(f.listFiles());

        BufferedReader br= new BufferedReader(new FileReader(f));

        int i;
/*
        while ((i = f.read()) != -1)
            System.out.print((char)i);

 */
        }
        /*
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1,2000);
        map.put(2, 3000);
        map.put(3, 2000);

        Iterator<Integer> itr = map.keySet().iterator();


        while(itr.hasNext())
        {


        }

        */





    }

