package _13_Stu_Interfaces.Solved;

class Book implements Printable {

  private final String title;

  private final int pages;

  Book (String title, int pages) {
    this.title = title;
    this.pages = pages;
  }

  @Override public int getPageCount () {
    return this.pages;
  }

  @Override public void print () {
    // Send to real printer
  }

  @Override public void renderForPrinting () {
    // Reset margins, etc., such that text is justified on page
  }

}
