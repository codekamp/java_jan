package codekamp;


public class Demo {


    public static void main(String[] args) {

        CodeKampFrame frame1 = new CodeKampFrame();
        CodeKampFrame frame2 = new CodeKampFrame();

        frame1.setSibling(frame2);

        frame1.setVisible(true);
        frame2.setVisible(true);
    }
}