package additionalLessons.user;

public class User {
    
    private DynamicStrArray st = new DynamicStrArray();
    private String name, surname, password, email = "Error: Wrong Email Format";

    User(String n, String s, String p, String e) {
        this.name = n;
        this.surname = s;
        this.password = p;
        if (e.contains("@") && (e.endsWith(".com") || e.endsWith(".ru"))) {
            this.email = e;
        }
        pushData();
    }

    private void pushData() {
        st.add(name);
        st.add(surname);
        st.add(password);
        st.add(email);
    }

    public void printUserData() {
        System.out.println("name: " + name);
        System.out.println("surname: " + surname);
        System.out.println("password: " + password);
        if (email.equals("Error: Wrong Email Format")) {
            System.out.print("email: ");
            System.err.println("Error: Wrong Email Format");
        } else {
            System.out.println("email: " + email);
        }
    }

}
