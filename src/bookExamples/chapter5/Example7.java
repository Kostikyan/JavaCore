package bookExamples.chapter5;

public class Example7 {

    public static void main(String[] args) {

        int i, j;
        i = 100; j = 200;
        // рассчитать среднее значение переменных i и j
        while(++i < --j); // у этого цикла отсутствует тело
        System.out.println("Cpeднee значение равно " + i ) ;


    }

}
