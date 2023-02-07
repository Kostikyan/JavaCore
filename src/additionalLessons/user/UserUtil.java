package additionalLessons.user;
public class UserUtil extends User{

    protected static final DynamicStrArray st = new DynamicStrArray();

    UserUtil(){
        if(email.contains("@") && (email.endsWith(".ru") || email.endsWith(".com"))){
            addData();
        }else{
            System.out.println("Wrong Email Format! (example: admin@mail.ru or admin@gmail.com)");
            while(!email.contains("@") && (!email.endsWith(".ru") || !email.endsWith(".com"))){
                System.out.print("enter correct email: ");
                email = sc.nextLine();
                boolean isTrue = email.contains("@") && (email.endsWith(".ru") || email.endsWith(".com"));
                if(isTrue){
                    addData();
                }
            }
        }
        System.out.println();
    }

    private void addData(){
        st.add(super.name);
        st.add(super.surname);
        st.add(super.password);
        st.add(super.email);
    }

}
