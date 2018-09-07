import java.awt.*;
import java.util.Random;
public abstract class Figura {
    protected int x,y,r,g,b;
    protected Color col;

    public Figura(int ex,int ye)
    {
        Random rand = new Random();
         r = rand.nextInt(255);
        Random rand2 = new Random();
         g = rand2.nextInt(255);
        Random rand3 = new Random();
         b = rand3.nextInt(255);

        x=ex-25;
        y=ye-25;
        col = Color.getHSBColor(r,g,b);
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public void setColor()
    {
        Random rand = new Random();
        int r = rand.nextInt(255);
        Random rand2 = new Random();//XD
        int g = rand2.nextInt(255);
        Random rand3 = new Random();
        int b = rand3.nextInt(255);
        col = Color.getHSBColor(r,g,b);
    }
    public abstract void paint(Graphics g);

}
