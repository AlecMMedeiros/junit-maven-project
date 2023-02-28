import br.com.bcoder.DataBase;
import br.com.bcoder.Person;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import java.time.LocalDate;

public class DataBaseTest {

  @BeforeAll
  static void connected() {
    DataBase.connectDb();
  }

  @BeforeEach
  void insertUser(){
    DataBase.insertUser(new Person("MrTeste", LocalDate.of(2001, 10, 11)));
  }

  @AfterEach
  void removeUser(){
    DataBase.removeUser(new Person("MrTeste", LocalDate.of(2001, 10, 11)));
  }

  @Test
  void fakeValidationOfNothing(){
    Assumptions.assumeTrue("root".equals((System.getenv("User"))));
    Assertions.assertTrue(true);
  }

  @Test
  @EnabledIfEnvironmentVariable(named = "USER", matches = "bcoder")
  void fakeValidationOfNothing2(){

    Assertions.assertTrue(true);
  }


  @AfterAll
  static void disconnected() {
    DataBase.disconnectDb();
  }
}
