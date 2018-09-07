import javax.swing.*;

import java.awt.*;



public class MiVentana extends JFrame {
    private static final long serialVersionUID = 3169475609810170559L;
    private MiCanvas canvas;
    public MiVentana()
    {   super();
        setLayout(new BorderLayout());
        canvas = new MiCanvas();
        add(canvas,BorderLayout.CENTER);
    }


}