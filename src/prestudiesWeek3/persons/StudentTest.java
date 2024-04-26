package prestudiesWeek3.persons;

public class StudentTest {
    public static void main(String[] args) {
        Student max = new Student("I like numbers in Java - aren't they int-eresting?!");
        max.setName("Max"); max.setAge(27); max.setAddress(" Wall street 22");
        max.introduce();
        max.tellJoke();
    }
}
