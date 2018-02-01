package codekamp;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello World!");


        Cat c1 = new Cat();
        Cat c2 = new Cat();

        c1.name = "Mars";

        c2.name = "Pluto";

        c1.climbTree();


        c1.kick(c2);


        Dog d1 = new Dog();
        d1.name = "Bush";

        d1.climbTree();


        // in a variable of Xyz class we can store objects Xyz class and it's subclasses
        Animal a1 = new Dog();
        a1.name = "Clinton";


        // At compile time: function search starts from Class of variable
        // At run time: function search starts from Class of Object
        a1.chaseTale();
    }
}

//http://github.com/codekamp