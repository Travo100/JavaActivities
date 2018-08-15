package _10_Ins_Subclasses_Demo;

class Cat extends Animal {

  Cat (String name) {
    super(name);
  }

  public String getName () {
    return this.name;
  }

  void meow () {
    System.out.println("Meow!");
  }

  void purr () {
    System.out.println("Purr!");
  }
}
