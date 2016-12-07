class Runner {
  public static void main (String[] args) {
    Container container = new Container("jar");
    for (int i = 0; i < 8; i++) {
      Coin item = new Coin();
      container.addToContents(item);
      Note item2 = new Note();
      container.addToContents(item2);
      System.out.println(container.contentsCount());
    }
  }
}
