package additionalLessons.user;
public class User {

    private StrStack st = new StrStack();
    private String name, surname, password, email = "Error: Wrong Email Format";
    User(String n, String s, String p, String e){
        this.name = n;
        this.surname = s;
        this.password = p;
        if(e.contains("@") && (e.endsWith(".com") || e.endsWith(".ru"))) {
            this.email = e;
        }
        pushData();
    }
    private void pushData(){
        st.push(name);
        st.push(surname);
        st.push(password);
        st.push(email);
    }
    public void printUserData(){
        System.out.println("name: " + name);
        System.out.println("surname: " + surname);
        System.out.println("password: " + password);
        if(email.equals("Error: Wrong Email Format")){
            System.out.print("email: ");
            System.err.println("Error: Wrong Email Format");
        }else {
            System.out.println("email: " + email);
        }
    }

}
