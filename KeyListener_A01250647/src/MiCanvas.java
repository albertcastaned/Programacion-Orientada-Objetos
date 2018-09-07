import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MiCanvas extends Canvas implements KeyListener {
    private Cuadrado cuad;
    private Rectangulo rect;
    public MiCanvas()
    {
        super();
        cuad = new Cuadrado(0,0);
        rect = new Rectangulo(100,100);
        addKeyListener(this);


    }

    public void paint(Graphics g)
    {
        cuad.paint(g);
        rect.paint(g);


    }


    public boolean collision(int Ax1, int Ay1, int Ax2, int Ay2, int Bx1, int By1, int Bx2, int By2)
    {
       if((Ax1 < Bx2) && (Ax2 > Bx1) && (Ay1 < By2) && (Ay2 > By1))
            return true;
        else
            return false;
    }
    public boolean collisionWindow()
    {
        if((cuad.getX()<0)||(cuad.getX()+50>getWidth()+3)||(cuad.getY()<0)||(cuad.getY()+50>getHeight()))
            return true;
        else
            return false;
    }

    @Override
    public void keyPressed(KeyEvent tecla) {


            switch (tecla.getKeyCode()) {
                case 37:
                    cuad.decrX();
                    if ((!collision(rect.getX(),rect.getY(),rect.getX()+50,rect.getY()+100,cuad.getX(),cuad.getY(),cuad.getX()+50,cuad.getY()+50))&&(!collisionWindow()))
                    {
                        repaint();

                    }else{
                        cuad.incrX();
                    }
                    break;
                case 38:
                    cuad.decrY();
                    if ((!collision(rect.getX(),rect.getY(),rect.getX()+50,rect.getY()+100,cuad.getX(),cuad.getY(),cuad.getX()+50,cuad.getY()+50))&&(!collisionWindow())) {
                        repaint();
                    }else{
                        cuad.incrY();
                    }
                    break;
                case 39:
                    cuad.incrX();
                    if((!collision(rect.getX(),rect.getY(),rect.getX()+50,rect.getY()+100,cuad.getX(),cuad.getY(),cuad.getX()+50,cuad.getY()+50))&&(!collisionWindow())){
                        repaint();
                    }else{
                        cuad.decrX();
                    }
                    break;
                case 40:
                    cuad.incrY();
                    if((!collision(rect.getX(),rect.getY(),rect.getX()+50,rect.getY()+100,cuad.getX(),cuad.getY(),cuad.getX()+50,cuad.getY()+50))&&(!collisionWindow())) {
                        repaint();
                    }else{
                        cuad.decrY();
                    }
                    break;

        }
        System.out.println(cuad.getX()+" "+cuad.getY()+"\n");
        System.out.println(collisionWindow());
        System.out.println(rect.getX()+" "+rect.getY());
    }

    @Override
    public void keyReleased(KeyEvent tecla){

    }

    @Override
    public void keyTyped(KeyEvent tecla) {

    }
    }
