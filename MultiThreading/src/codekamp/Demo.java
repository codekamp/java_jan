package codekamp;

public class Demo implements Runnable {

    volatile public static int flatCount = 10;

    public static void main(String[] args) {
        Demo d1 = new Demo();

        Thread t1 = new Thread(d1);
        t1.setName("codekamp thread");
        t1.start();

        Demo.countDogs();
        Demo.countCats();
    }

    public static void countDogs() {
        for(int i = 1; i <= 30; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
            System.out.println("Dog number " + i + " on " + Thread.currentThread().getName());
        }
    }


    synchronized public static void countCats() {
        for(int i = 1; i <= 45; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
            System.out.println("Cat number " + i + " on " + Thread.currentThread().getName());
        }
    }

    @Override
    public void run() {
        Demo.countCats();
    }
}