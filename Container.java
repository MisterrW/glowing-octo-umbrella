class Container {
  private String name;
  private Item[] contents;

  public Container(String name) {
    this.name = name;
    this.contents = new Item[5];
  }

  public int contentsCount() {
    int contentsCount = 0;
    for (Item item : contents) {
      if (item != null) {
        contentsCount ++;
      }
    }
    return contentsCount;
  }

  public void addToContents(Item item) {
    if (contentsCount() < contents.length) {
      contents[contentsCount()] = item;
    } else {
      return;
    }
  }
}