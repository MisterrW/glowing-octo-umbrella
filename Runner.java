class Runner {
  public static void main (String[] args) {
    Container container = new Container("Jeff");
    for (int i = 0; i < 5; i++) {
      Item item = new Item();
      container.addToContents(item);
      System.out.println(container.contentsCount());
    }
  }
}