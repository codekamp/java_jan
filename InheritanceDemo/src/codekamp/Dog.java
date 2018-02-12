package codekamp;

public class Dog extends Animal {

    public static int count = 0;

//    What are constructors?
    // 1. non static methods
    // 2. Same name as class name
    // 3. No Return type

    public Dog(int xyz) {
        this();
        System.out.println("Int vala consturoctor " + xyz);
        this.name = "random";
    }

    public Dog() {
        super();
        System.out.println("Parameterless constructor");
    }

    public void doFavoiteThing() {

        System.out.println("Chasing the tale");
    }

    public void walkLeft() {

        System.out.println("Dog ka Walking to left");
    }

    public void handshake() {

        System.out.println("do handshake");
    }


    // Rules of Constructor inhertance:
    // 1. Only parameterless (default) constructor can be inherticed.
    // 2. And that too only when child class has no constructor of its' own.


    // First line in every contructor should be call to parent class kaa constructor either...
    // ... directly or indirectly
    // i.e. first line in every constructor should be this(some params), or super(some params).
    // If you dont' do it, java assumes super()

//    What is super?


    // Constctor can only be called on new objects and normal methods can only be called on existing objects.
}