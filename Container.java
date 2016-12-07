import java.util.*;

class Container {
  private String name;
  private ArrayList<Item> contents;

  public Container(String name) {
    this.name = name;
    this.contents = new ArrayList<Item>();
  }

  public int contentsCount() {
    return contents.size();
  }

  public void addToContents(Item item) {
    contents.add(item);
  }
}