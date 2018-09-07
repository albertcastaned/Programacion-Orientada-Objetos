import java.awt.*;

public class Cuadrado extends Figura {


    public Cuadrado(int ex,int ye)
    {
        super(ex,ye);
    }
    public void paint(Graphics g)
    {
        g.setColor(col);
        g.fillRect(x, y, 50, 50);

    }


}
