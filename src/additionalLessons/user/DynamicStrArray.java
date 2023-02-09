package additionalLessons.user;

public class DynamicStrArray {

    // array and size
    private User[] array = new User[4];
    private int size = 0;

    // method for adding elements in array
    public void add(User value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    // if elements count 10+
    private void extend() {
        User[] newArr = new User[array.length + 4];
        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[i];
        }
        array = newArr;
    }

    public void searchByName(String name) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            User user = array[i];
            if (user.getName().startsWith(name)) {
                System.out.println(user);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Error: User with name (" + name + ") not found");
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

    public void searchBySurname(String surname) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            User user = array[i];
            if (user.getSurname().startsWith(surname)) {
                System.out.println(user);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Error: User with surname (" + surname + ") not found");
        }
    }

    public void searchByEmail(String email) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            User user = array[i];
            if (user.getEmail().startsWith(email)) {
                System.out.println(user);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Error: User with email (" + email + ") not found");
        }
    }
}
