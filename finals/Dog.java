public class Dog {
    public static void main(String[] x) {
      System.out.println("I'm a dog");
      bark();
      bark();
      eat("Bone");
      sleep();
    }

    public static void bark()
    {
        System.out.println("Bark");
    }

    public static void eat(String s) {
        System.out.println("I'm hungry! I want, " + s);
    }

    public static void sleep() {
        System.out.println("Zzzzzz");
    }
}
