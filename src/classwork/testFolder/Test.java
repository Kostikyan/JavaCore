package classwork.testFolder;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Objects;

public class Test {
    public static void main(String[] args) throws IOException {
        String path = "/Users/mno/IdeaProjects/javaCore/src/classwork/testFolder/test.txt";
        String pathFolder = "/Users/mno/IdeaProjects/javaCore/src/classwork/testFolder";
        File file = new File(path);

        System.out.println(File.separator);

        long lastModified = file.lastModified();
        Date date = new Date(lastModified);
        System.out.println(date);

        System.out.println(file.length());
        File file1 = new File(pathFolder);
        file.setWritable(false); // create read only file

        File[] list = file1.listFiles();
        for (File s : Objects.requireNonNull(list)) {
            if(s.isFile()){
                System.out.println("name: " + s.getName());
                System.out.println("size: " + s.length());
            }
        }

        File f = new File("/Users/mno/IdeaProjects/javaCore/src/classwork/testFolder/yyy.txt");
        if(f.exists()){
            f.delete();
        }
        System.out.println("file yyy.txt was deleted");

       // boolean newFile = file.createNewFile();
       // if(newFile){
       //     System.out.println("file created");
       // }else{
       //     System.out.println("file not created");
       // }

    }

}
