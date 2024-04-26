package prestudiesWeek3.persons;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Max");
        person.setAge(30);
        person.setAddress("Schlossplatz 2, 48149 Münster");
        person.introduce();
    }
}
