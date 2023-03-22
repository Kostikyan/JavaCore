package additionalLessons.fileTimeRead;

import additionalLessons.fileTimeRead.threads.ReaderThread;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class BigFileReadWithThreads {
    public final static String FILE_PATH = "/Users/mno/IdeaProjects/javaCore/src/additionalLessons/fileTimeRead/files/bigFile.png";
    public final static File FILE = new File(FILE_PATH);
    public final static int NUMBER_OF_THREADS = 6;

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        List<Thread> threadArrayList = new ArrayList<>();
        long fileSize = FILE.length();
        long lotSize = fileSize / NUMBER_OF_THREADS;

        for (int i = 0; i < NUMBER_OF_THREADS; i++) {
            long start = i * lotSize;
            long end = (i == NUMBER_OF_THREADS - 1) ? fileSize : (i + 1) * lotSize;
            Thread t = new ReaderThread(FILE, start, end);
            threadArrayList.add(t);
            t.start();
        }

        for (Thread t : threadArrayList) {
            t.join();
        }

        long endTime = System.currentTimeMillis();
        long runtime = endTime - startTime;
        System.out.println(runtime);
    }
}