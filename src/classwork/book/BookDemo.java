package classwork.book;

import java.util.Scanner;

public class BookDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BookStorage bs = new BookStorage();

        boolean isRun = true;
        while (isRun){
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 for add book");
            System.out.println("Please input 2 for print all book");
            System.out.println("Please input 3 for search book by name");

            String command = sc.nextLine();
            switch (command){
                case "0":
                    isRun = false;
                case "1":
                    System.out.print("\nplease input title: ");
                    String title = sc.nextLine();
                    System.out.print("please input price: ");
                    String price = sc.nextLine();
                    System.out.print("please input author name: ");
                    String author = sc.nextLine();
                    Book book = new Book(title, author, Double.parseDouble(price));
                    bs.add(book);
                    System.out.println("\nbook was added");
                    break;
                case "2":
                    bs.print();
                    break;
                case "3":
                    System.out.println("please input keyword");
                    String keyword = sc.nextLine();
                    bs.searchByName(keyword);
                    break;
                default:
                    System.out.println("wrong command please try again!");
            }
        }

    }

}
