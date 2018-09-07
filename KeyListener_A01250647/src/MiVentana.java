import javax.swing.*;
import java.awt.*;

public class MiVentana extends JFrame {
    private MiCanvas canvas;

    public MiVentana()
    {
        super();
        setLayout(new BorderLayout());
        canvas = new MiCanvas();
        add(canvas,BorderLayout.CENTER);
    }

}
