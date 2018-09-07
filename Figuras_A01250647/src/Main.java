import javax.swing.JFrame;


public class Main {

    public static void main(String[] args) {
        MiVentana mv = new MiVentana();
        mv.setSize(600 ,400);
        mv.setVisible(true);
        mv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}