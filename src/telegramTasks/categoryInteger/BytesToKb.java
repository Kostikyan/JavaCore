package telegramTasks.categoryInteger;

public class BytesToKb {

    public static void main(String[] args) {

       // Задача 17:  Дан размер файла в байтах.
       // Используя операцию деления нацело,
       // найти количество полных килобайтов,
       // которые занимает данный файл (1 килобайт = 1024 байта)

        int fileB = 132213331;
        int fileKB = fileB / 1024;
        System.out.println("количество полных килобайтов: " + fileKB);

    }

}
