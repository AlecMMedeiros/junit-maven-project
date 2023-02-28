import br.com.bcoder.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class PersonTest {
  Person mrTest = new Person("MrTest", LocalDate.of(2004,1,1));
  Person mrMinor = new Person("MrMinor", LocalDate.of(2022,1,1));

  @Test
  void validateGetAge(){
    Assertions.assertEquals(19, mrTest.getAge());
  }

  @Test
  void validateGetName(){
    Assertions.assertEquals("MrTest", mrTest.getName());
    Assertions.assertNotEquals("MrTest", mrMinor.getName());
  }

  @Test
  void validateOverEighteenAge(){
    Assertions.assertTrue(mrTest.overEighteenAge());
    Assertions.assertFalse(mrMinor.overEighteenAge());
  }
}
