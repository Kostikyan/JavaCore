package telegramTasks.categoryArray;

public class IfElsePrintNumInArr {

    public static void main(String[] args) {

        // Задача 87: Дан массив ненулевых
        // целых чисел размера 10. Вывести
        // значение первого элемента, значение
        // которого меньше чем у элемента с
        // индексом 9. Если таких элементов
        // нет, то вывести 0

        int[] intsArray = {100,222,133,442,311,423,123,1343,20,40};
        int el = intsArray[9];
        int bigger = 0;
        System.out.println(intsArray[0]);
        for (int i = 0; i < intsArray.length; i++) {
            if(intsArray[i] > el && intsArray[i] > bigger){
                bigger = intsArray[i];
            }
        }
        System.out.println(bigger);

    }

}
