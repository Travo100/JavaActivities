package _12_Ins_Interfaces_Demo;

interface Pet {

  default public void cuddle () {
    System.out.println("Cuddle cuddle!");
  }

  public String getName();

}
