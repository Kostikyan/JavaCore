package additionalLessons.fileTimeRead.threads;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ReaderThread extends Thread{
    private final File file;
    private final long start;
    private final long end;

    public ReaderThread(File file, long start, long end) {
        this.file = file;
        this.start = start;
        this.end = end;
    }

    public void run() {
        try (RandomAccessFile raf = new RandomAccessFile(file, "r")) {
            raf.seek(start);
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = raf.read(buffer, 0, buffer.length)) != -1) {
                if (raf.getFilePointer() >= end) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
