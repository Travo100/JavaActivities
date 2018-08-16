package _14_Ins_Exceptions_Demo;

public class Throw {
    public static void main (String[] args) {

        printSeparator();

        try {
            throw new Exception("Oh no! A disaster!");
        } catch (Exception e) {
            System.out.println("Exception caught. Continuing execution...");
        }

//        try {
//            throw new Exception("Oh no! A disaster!");
//        } catch (Exception e) {
//            System.out.println("Exception caught. Continuing execution...");
//        } catch (ClassCastException e) {
//            System.out.println("Actually, this is impossible here...");
//        }

        System.out.println("This will run, now that we have a catch block.");

        printSeparator();

    }

    private static void printSeparator () {
        System.out.println(new String(new char[6]).replace("\0", "--"));
    }
}
