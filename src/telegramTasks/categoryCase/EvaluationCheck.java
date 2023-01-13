package telegramTasks.categoryCase;

public class EvaluationCheck {

    public static void main(String[] args) {
        //Задача 11: Дано целое число K. Вывести строку-описание оценки,
        //соответствующей числу K (1 — «плохо», 2 — «неудовлетворительно»,
        //3 — «удовлетворительно», 4 — «хорошо», 5 — «отлично»).
        //Если K не лежит в диапазоне 1–5, то вывести строку «ошибка»
        int evaluation = 3;
        checker(evaluation);
    }

    public static void checker(int evo) {
        switch (evo){
            case 1:
                System.out.println("bad");
                break;
            case 2:
                System.out.println("unsatisfactory");
                break;
            case 3:
                System.out.println("satisfactory");
                break;
            case 4:
                System.out.println("good");
                break;
            case 5:
                System.out.println("great");
                break;
            default:
                System.out.println("error");
        }
    }
}
