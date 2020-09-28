import javax.swing.JOptionPane;

public class demoPerson {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.setName("Jeff");
        p1.setAddress("Edinburgh");
        p1.setAge(39);

        p1.printDetails();
    }
}
