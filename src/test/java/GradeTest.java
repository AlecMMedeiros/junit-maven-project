import br.com.bcoder.Grade;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GradeTest {
  Grade gradesA = new Grade(new int[]{10, 7, 8});
  Grade gradesB = new Grade(new int[]{10, 7, 8});
  Grade gradesC = new Grade(new int[]{10, 8, 6});

  @Test
  void testingEquals(){
    Assertions.assertArrayEquals(this.gradesA.getGrades(), this.gradesB.getGrades());
    Assertions.assertNotEquals(this.gradesB.getGrades(), this.gradesC.getGrades());
  }

  @Test
  void testingNotNull(){
    Assertions.assertNotNull(this.gradesB.getGrades());
  }

}
