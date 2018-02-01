package codekamp;

public class Cat extends Animal {


    public void kick(Cat c) {
        System.out.println(this.name + " is kicking " + c.name);
    }
}