package codekamp;

import java.util.Random;

public class Demo {

    private static Dog d1;
    private static Cat c1;
    private static int randomInt;

    public static void main(String[] args) {

        Random r = new Random();

        Demo.randomInt = r.nextInt(2);

        if(Demo.randomInt == 0) {
            Demo.d1 = new Dog();
        } else {
            Demo.c1 = new Cat();
        }

        Demo.onLeftSwipe();
        Demo.onRightSwipe();
        Demo.onDoubleTap();
    }

    public static void onRightSwipe() {
        if(Demo.randomInt == 0) {
            Demo.d1.walkRight();
        } else {
            Demo.c1.walkRight();
        }
    }

    public static void onLeftSwipe() {
        if(Demo.randomInt == 0) {
            Demo.d1.walkLeft();
        } else {
            Demo.c1.walkLeft();
        }
    }

    public static void onDoubleTap() {
        if(Demo.randomInt == 0) {
            Demo.d1.doFavoiteThing();
        } else {
            Demo.c1.doFavoiteThing();
        }
    }
}