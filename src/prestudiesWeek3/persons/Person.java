package prestudiesWeek3.persons;

public class Person {
    private String name;
    private int age;
    private String address;

    public void introduce() {
        System.out.println("Hello my name is " + name + ". I'm " + age + " years old. I live at " + address + ".");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}

