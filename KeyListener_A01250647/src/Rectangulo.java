import java.awt.*;
public class Rectangulo {
    private int x,y;
    public Rectangulo(int ex,int ye)
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


    public void paint(Graphics g)
    {
        g.setColor(Color.BLUE);
        g.fillRect(x,y,50,100);
    }
}
