import static org.junit.Assert.assertEquals;
import org.junit.*;

public class ContainerTest {
  Container container;
  Item item;

  @Before
  public void before() {
    container = new Container("box");
    item = new Item();
  }

  @Test
  public void canAddItems() {
    container.addToContents(item);
    assertEquals(1, container.contentsCount());
  }

  @Test
  public void maxItems5() {
    for (int i = 0; i < 8; i++) {
      container.addToContents(item);
    }
    assertEquals(5, container.contentsCount());
  }
}