import java.awt.*;
import java.util.Random;

public class Pelota {
    private int x,y,Vx,Vy;
    private Color col;
    private Random ran;
    private Random col1,col2,col3;
    private int signo;
    public Pelota()
    {
        ran=new Random();
        x=ran.nextInt(550);
        y=ran.nextInt(350);
        signo=ran.nextInt(2)+1;
        if(signo%2==0)
            signo=-1;
        else
            signo=1;
        Vx=2*signo;
        Vy=2*signo;
        col1=new Random();
        col2=new Random();
        col3=new Random();
        col= new Color(col1.nextInt(255),col2.nextInt(255),col3.nextInt(255));

    }
    public void movimiento()
    {
        x+=Vx;
        y+=Vy;

        if(x<=0||x>=600-40)
            Vx*=-1;
        if(y<=0||y>=400-64)
            Vy*=-1;
    }

    public void paint(Graphics g)
    {
        g.setColor(col);
        g.fillOval(x,y,32,32);
    }
}
