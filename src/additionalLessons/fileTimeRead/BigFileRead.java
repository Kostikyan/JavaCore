package additionalLessons.fileTimeRead;

import java.io.*;

public class BigFileRead {
    public final static String FILE_PATH = "/Users/mno/IdeaProjects/javaCore/src/additionalLessons/fileTimeRead/bigFile.png";
    public final static File FILE = new File(FILE_PATH);

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        try(BufferedReader br = new BufferedReader(new FileReader(FILE))){
            String line = "";
            while((line = br.readLine()) != null){

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        long runtime = endTime - startTime;
        System.out.println(runtime);
    }
}
