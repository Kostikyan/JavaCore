package homework.homework17.fileUtil;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
/**
     <h1>There are additional parts in the homework that I have added</h1>
     <h2>
     I tried to create a programme
     for the most unadvanced user, taking
     into account all the mistakes I came across
     when I deliberately used the programme badly.
     </h2>
 */
public class FileUtil {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){}

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearch() {
        System.out.print("Enter path: ");
        String directoryPath = scanner.nextLine();
        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            System.out.print("Enter file name: ");
            String fileName = scanner.nextLine();
            File file = new File(directory, fileName);
            if(file.isFile()) {
                System.out.println("file exists: " + file.exists());
            }
        } else {
            System.out.println("Invalid directory path");
        }
    }

    // այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() {
        System.out.print("Enter directory path: ");
        String directoryPath = scanner.nextLine();

        File directory = new File(directoryPath);
        if (!directory.isDirectory() || !directory.exists()) {
            System.out.println("Invalid directory path");
            return;
        }

        System.out.print("Enter keyword: ");
        String keyword = scanner.nextLine();

        boolean found = false;
        for (File file : Objects.requireNonNull(directory.listFiles())) {
            if (file.getAbsolutePath().endsWith(".txt")) {
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        for (String word : line.split("\\s+")) {
                            if (word.equals(keyword)) {
                                System.out.println("Keyword " + keyword + " found in file: " + file.getName());
                                found = true;
                                break;
                            }
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        if (!found) {
            System.out.println("Keyword not found in any file");
        }
    }


    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() {
        System.out.print("Enter txt file path: ");
        String txtPath = scanner.nextLine();
        File file = new File(txtPath);
        if (!file.isFile() || !file.exists() || !file.getAbsolutePath().endsWith(".txt")) {
            System.out.println("Invalid file path");
            return;
        }

        System.out.print("Enter keyword: ");
        String keyword = scanner.nextLine();

        try (LineNumberReader rdr = new LineNumberReader(new FileReader(file))) {
            String line;
            int count = 0;
            ArrayList<Integer> lineNumbers = new ArrayList<>();
            while ((line = rdr.readLine()) != null) {
                for (String word : line.split("\\s+")) {
                    if (word.equals(keyword)) {
                        count++;
                        lineNumbers.add(rdr.getLineNumber());
                    }
                }
            }
            System.out.print("Number of times this word appears: " + count + "\nin line(s): ");
            System.out.println(lineNumbers);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {
        System.out.print("Enter directory path: ");
        String directoryPath = scanner.nextLine();

        File directory = new File(directoryPath);
        if (!directory.isDirectory() || !directory.exists()) {
            System.out.println("Invalid directory path");
            return;
        }

        File[] files = directory.listFiles();
        long amountBytes = 0;

        for (File file : Objects.requireNonNull(files)) {
            amountBytes += file.length();
        }

        amountBytes /= 1024; // byte to kb
        System.out.println("Size of the directory: " + amountBytes + "kb");
    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() {
        System.out.print("input directory path: ");
        String directoryPath = scanner.nextLine();

        File directory = new File(directoryPath);
        if (!directory.isDirectory() || !directory.exists()) {
            System.out.println("Invalid directory path");
            return;
        }

        System.out.print("input file name (format auto: txt): ");
        String fileName = scanner.nextLine() + ".txt";
        File file = new File(directory, fileName);
        try {
            if (file.createNewFile()) {
                System.out.println("File created " + file.getName());
            } else {
                System.out.println("File already exists");
                return;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.print("input file content: ");
        String content = scanner.nextLine();

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
            bw.write(content);
            System.out.println("Content added!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
