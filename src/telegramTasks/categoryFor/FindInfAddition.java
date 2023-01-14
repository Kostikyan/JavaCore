package telegramTasks.categoryFor;

public class FindInfAddition {

    public static void main(String[] args) {

        // Задача 63: Дано целое число N (> 0).
        // Найти сумму 1 + 1/2 + 1/3 + ... + 1/N (вещественное число)
        
        int n = 4; // n > 0
        double sum = 0;
        for (double i = 1; i <= n; i++) {
            sum += (double) 1/i;
            if(i == n){
                break;
            }
        }
        System.out.println(sum);
    }

}
