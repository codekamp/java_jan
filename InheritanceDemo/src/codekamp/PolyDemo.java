package codekamp;

import java.util.Random;

public class PolyDemo {

    private static Animal a1;

    public static void main(String[] args) {

        Random r = new Random();

        int randomInt = r.nextInt(2);


        if(randomInt == 0) {
            PolyDemo.a1 = new Dog();

        } else {
            PolyDemo.a1 = new Cat();
        }

        PolyDemo.onLeftSwipe();
        PolyDemo.onRightSwipe();
        PolyDemo.onDoubleTap();
    }

    public static void onRightSwipe() {
        PolyDemo.a1.walkRight();
    }

    public static void onLeftSwipe() {
        PolyDemo.a1.walkLeft();
    }

    public static void onDoubleTap() {
        PolyDemo.a1.doFavoiteThing();


        if(PolyDemo.a1 instanceof Dog) {
            Dog d1 = (Dog) PolyDemo.a1;
            d1.handshake();
        } else {
            System.out.println("Object is not Dog");
        }
    }

    // cave of programming
}