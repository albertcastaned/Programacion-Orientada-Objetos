import java.util.ArrayList;


public class Pelotas {
    private ArrayList<Pelota> list;
    public Pelotas()
    {
        list = new ArrayList <Pelota> ();
    }
    public void agrega(Pelota pe)
    {
        list.add(pe);
    }
    public Pelota getPelota(int i)
    {
        return (Pelota) list.get(i);
    }
    public int getSize()
    {
        return list.size();
    }
}

