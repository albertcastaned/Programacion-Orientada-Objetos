import java.awt.*;

public class Circulo extends Figura {

    public Circulo(int ex,int ye)
    {
        super(ex,ye);
    }

    public void paint(Graphics g)
    {
        g.setColor(col);
        g.fillOval(x, y, 50, 50);
    }



}
