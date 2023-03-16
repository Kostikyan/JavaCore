package telegramTasks.categoryBegin;
//  Задача 99: Даны катеты прямоугольного треугольника a и b. Найти его гипотенузу c и периметр P:
//  c = sqrt(a^2 + b^2)
//  P = a + b + c
        /*
            |\
            | \
            |  \
            |   \
            |    \
            |     \  c
         a  |      \
            |   P   \
            |        \
            |         \
            |          \
            |___________\
                 b
         */
public class RightTriangle {

    public static void main(String[] args) {

        int a = 5, b = 7;
        double c = Math.sqrt((a*a) + (b*b));
        double P = a + b + c;

        System.out.println(c);
        System.out.println(P);

    }
}
