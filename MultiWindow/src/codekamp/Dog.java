package codekamp;


public class Dog {

    // Static code block
    // 1. Runs only once per software session
    // 2. First time the containing class is used
    static {
        System.out.println("Hello world!!!");
    }

    static {
        System.out.println("Dog's static code block");
    }

    public String name;

    public void talk() {

        System.out.println("Wuff Wuff!");
    }

    public void hello() {

        System.out.println("Dog saying hello");
    }

    public static void world() {

    }

    public String getName() {

        return "Jupiter";
    }

    public class Xyz {

        public int a;
        private int b;

//        public static void something() {
//            System.out.println("something");
//        }

        public void anotherThing(Xyz x) {
            System.out.println("another thing ");
            System.out.println(this.a);
            System.out.println(Dog.this.name);
        }
    }

    public class Pqr {

    }
}