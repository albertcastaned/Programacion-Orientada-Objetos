import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class MiCanvas extends Canvas {


    private Timer reloj;
    private Timer reloj2;
    private BufferedImage imagen;
    private Pelotas pelotas;

    public MiCanvas(){
        super();
        imagen=new BufferedImage(600,500,BufferedImage.TYPE_INT_RGB);
        pelotas = new Pelotas();
        pelotas.agrega(new Pelota());

        reloj = new Timer(5, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i=0;i<pelotas.getSize();i++)
                {
                    pelotas.getPelota(i).movimiento();
                }
                repaint();

            }
        });

        reloj.start();
        reloj2 = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pelotas.agrega(new Pelota());
            }
        });
        reloj2.start();


    }
    public void update(Graphics g)
    {
        paint(g);
    }
    public void paint(Graphics g)
    {
        Graphics gra = imagen.createGraphics();

        gra.setColor(Color.white);
        gra.fillRect(0,0,getWidth(),getHeight());
        for(int i=0;i<pelotas.getSize();i++)
        {
            pelotas.getPelota(i).paint(gra);
        }
       g.drawImage(imagen,0,0,null);

    }




}