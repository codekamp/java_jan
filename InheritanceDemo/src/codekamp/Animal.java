package codekamp;

public class Animal {

    public String name;

    String xyz;
    int x;

    public Animal(int qwqwq) {
        System.out.println("Animal kaa int vala constructor " + qwqwq);
    }


    public Animal(String a, String b) {
        System.out.println("Animal kaa int vala constructor " + a);
    }

    public Animal() {
        System.out.println("ANimal kaa parameterless constructor");
    }

    public void walkLeft() {

        System.out.println("Walking to left");
        this.doFavoiteThing();
    }

    public void walkRight() {
        System.out.println("Walking to right");
    }

    public void doFavoiteThing() {
        System.out.println("Animal kaa favorite thing");
    }
}