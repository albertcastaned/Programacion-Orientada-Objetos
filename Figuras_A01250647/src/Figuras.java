import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

public class Figuras{

    private ArrayList<Figura> list;
    private int index;
    public Figuras(){
        list = new ArrayList<>();
        index=0;
        iniciar();
    }

    public void iniciar(){
        Random rand = new Random();
        int xrand = rand.nextInt(300);
        Random rand2 = new Random();
        int yrand = rand2.nextInt(200);
        list.add(new Circulo(xrand,yrand));
        index++;

    }
    public void add(Figura f)
    {
        list.add(f);
        index++;
    }
    public int getIndex(){
        return index;
    }
    public Figura getFigura(int x)
    {
        return list.get(x);
    }
    public boolean elegido(int x,int y)
    {   boolean bool=false;
        ListIterator<Figura> itr = list.listIterator();

        while(itr.hasNext())
        {       Figura p = itr.next();
                if(((x>p.getX())&&(x<p.getX()+50))&&((y>p.getY())&&(y<p.getY()+50))){
                bool = true;
                p.setColor();
            }
        }
        return bool;
    }
}
