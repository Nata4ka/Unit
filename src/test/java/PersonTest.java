import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class PersonTest {
    Person person = new Person("Каренина", "Анна",35);
    @Test
    public void personSurname(){
        String actual = person.getSurname();
        String expect = "Каренина";

        Assertions.assertEquals(actual,expect);
    }

    @Test
    public void personName(){
        String actual = person.getName();
        String expect = "Анна";

        Assertions.assertEquals(actual,expect);
    }

    @Test void personAge(){
        int actual = person.getAge();
        int expect = 35;

        Assertions.assertEquals(actual,expect);
    }

}
