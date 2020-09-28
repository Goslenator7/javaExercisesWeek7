import javax.swing.*;

public class Person {
    private String name;
    private String address;
    private int age;

    public Person() {
    }

    public String toString() {
        String output;

        output = "My name is "+name+", and I live in "+address+". I am "+age+" years old.";
        return output;
    }

    public void printDetails() {
        String output;

        output = toString();
        JOptionPane.showMessageDialog(null, output);
    }

    public void happyBirthday() {
        this.age = getAge()+1;
    }

    // Getter and setter for name
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for address
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getter and setter for age
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

