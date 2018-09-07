import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
public class MiCanvas extends Canvas implements MouseListener{
    private static final long serialVersionUID = 1L;
    private Figuras figs;

    public MiCanvas()
    {   super();
        figs = new Figuras();
        addMouseListener(this);
    }
    public void paint(Graphics g)
    {
        for(int i=0;i<figs.getIndex();i++)
        {
            figs.getFigura(i).paint(g);
        }

    }
    @Override
    public void mouseClicked(MouseEvent mouse) {
        if(!(figs.elegido(mouse.getX(),mouse.getY())))
        {
            Random r = new Random();
            int n = r.nextInt(2)+1;
            switch(n) {
                case 1:
                    figs.add(new Circulo(mouse.getX(), mouse.getY()));
                    break;

                case 2:
                    figs.add(new Cuadrado(mouse.getX(), mouse.getY()));
                    break;
            }
        }

        repaint();
    }
    @Override
    public void mouseEntered(MouseEvent mouse) {

    }
    @Override
    public void mouseExited(MouseEvent arg0) {

    }

    @Override
    public void mousePressed(MouseEvent mouse) {
    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
    }

}



