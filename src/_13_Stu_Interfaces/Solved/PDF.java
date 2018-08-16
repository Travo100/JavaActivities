package _13_Stu_Interfaces.Solved;

class PDF implements Printable {

  private final String title;

  PDF (String title, int pages) {
    this.title = title;
  }

  @Override public int getPageCount () {
    // Do complicated calculation based on viewport size and length
    return 10;
  }

  @Override public void print () {
    // Send to virtual printer or real printer depending on config
  }

  @Override public void renderForPrinting () {
    // Change color values to CMYK, etc.
  }

}
