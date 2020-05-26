import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class PangramTest {
    @Test
    public void test1() {
      String pangram1 = "The quick brown fox jumps over the lazy dog.";
      Solution pc = new Solution();
      assertEquals(true, pc.check(pangram1));
    }
    @Test
    public void test2() {
      String pangram2 = "You shall not pass!";
      Solution pc = new Solution();
      assertEquals(false, pc.check(pangram2));
    }
}

