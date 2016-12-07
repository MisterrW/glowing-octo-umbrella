import static org.junit.Assert.assertEquals;
import org.junit.*;

public class ContainerTest {
  Container container;
  Coin coin;
  Note note;

  @Before
  public void before() {
    container = new Container("box");
    coin = new Coin();
    note = new Note();
  }

  @Test
  public void canAddItems() {
    container.addToContents(coin);
    container.addToContents(note);
    assertEquals(2, container.contentsCount());
  }

}