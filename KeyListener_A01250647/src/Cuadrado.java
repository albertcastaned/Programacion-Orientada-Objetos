import java.awt.*;
public class Cuadrado {
    private int x,y;
    public Cuadrado(int ex,int ye)
    {
        x=ex;
        y=ye;
    }
    public int getX()
    {
        return x;
    }
    public int getY(){
        return y;
    }
    public void incrX()
    {
        x+=5;
    }
    public void incrY()
    {
        y+=5;
    }
    public void decrX()
    {
        x-=5;
    }
    public void decrY()
    {
        y-=5;
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.RED);
        g.fillRect(x,y,50,50);
    }
}
