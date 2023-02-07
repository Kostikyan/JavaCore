package additionalLessons.user;

public class UserData {

    public static void main(String[] args) {

        User user_1 = new User("Vahe", "Kostikyan", "Kampot123", "vahe@mail.com");
        User user_2 = new User("Vahe", "Kostikyan", "Kampot123", "vahe@mail.com");
        user_1.printUserData();
        user_2.printUserData();

    }

}
