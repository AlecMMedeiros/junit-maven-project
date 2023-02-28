import br.com.bcoder.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PersonTest {
  Person testPerson = new Person("MrTest", LocalDate.of(2004,1,1));

  @Test
  void validateGetAge(){
    Assertions.assertEquals(19, testPerson.getAge());
  }

  @Test
  void validateGetName(){
    Assertions.assertEquals("MrTest", testPerson.getName());
  }


}
