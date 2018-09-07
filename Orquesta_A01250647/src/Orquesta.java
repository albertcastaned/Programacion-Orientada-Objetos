import java.util.ArrayList;
import java.util.ListIterator;

public class Orquesta {
    private ArrayList<Instrumento>conjunto;
    public Orquesta()
    {
        conjunto = new ArrayList<>(10);
    }
    public Orquesta(int t)
    {
        conjunto = new ArrayList<>(t);
    }
    public void agrega(Instrumento i)
    {
        conjunto.add(i);
    }
    public <T extends Instrumento> void baja(Class<T> i)
    {
        ListIterator<Instrumento>itr=conjunto.listIterator();

        while(itr.hasNext())
        {   Instrumento instr = itr.next();
            if(instr.getClass().equals(i)) {
                itr.remove();
                break;
            }
        }
    }
    public String toString()
    {
        String returnstring = "";
        ListIterator<Instrumento>itr = conjunto.listIterator();
        while(itr.hasNext())
        {   Instrumento i = itr.next();
            returnstring+="\n"+i.toString()+"\n";
        }
        return returnstring;
    }

    public double costoTotal()
    {   double precio=0;

        ListIterator<Instrumento>itr=conjunto.listIterator();

        while(itr.hasNext())
        {   Instrumento i = itr.next();
            precio+=i.getCosto();
        }
        return precio;
    }

    public void saxofonesSoprano()
    {
        ListIterator<Instrumento>itr=conjunto.listIterator();



        while(itr.hasNext())
        {   Instrumento instr = itr.next();
            if(instr instanceof Saxofon)
            {
                if(((Saxofon)instr).getTipo()==2)
                {
                    System.out.println(instr.toString());
                }
            }
        }

    }

    public <T extends Instrumento> boolean checaLugar(Class<T> i)
    {   boolean flag=false;
        ListIterator<Instrumento>itr=conjunto.listIterator();



        while(itr.hasNext())
        {    Instrumento instr = itr.next();
            if(instr.getClass().equals(i))
            {
                flag=true;
            }

        }
        return flag;
    }



}

