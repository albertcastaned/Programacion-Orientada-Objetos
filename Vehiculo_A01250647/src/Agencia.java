
import java.util.ArrayList;
import java.util.ListIterator;

public class Agencia {
    private ArrayList<Vehiculo>lista;


    public Agencia(){
       lista= new ArrayList<>(10);

    }

    public Agencia(int t){
        lista= new ArrayList<>(t);
    }

    public void agregarCarro(Vehiculo e){
        lista.add(e);
    }

    public void borrarCarro(int p){
        p--;
        if(lista.remove(lista.get(p))){
            System.out.println("Vehiculo eliminado");
        }

    }

    public boolean existencia(int o) {
        boolean flag = false;
        ListIterator<Vehiculo> itr = lista.listIterator();
        switch (o) {
            case 1:
                while (itr.hasNext()) {
                    Vehiculo pick = itr.next();
                    if (pick instanceof Compacto) {
                        flag = true;
                    }
                }
                break;

            case 2:
                while (itr.hasNext()) {
                    Vehiculo pick = itr.next();
                    if (pick instanceof Pickup) {
                        flag = true;
                    }
                }
                break;

            case 3:
                while (itr.hasNext()) {
                    Vehiculo pick = itr.next();
                    if (pick instanceof Familiar) {
                        flag = true;
                    }
                }
                break;
                default:
                    System.out.println("Error, se introdujo otro valor");
                    break;



        }
        return flag;
    }


    public void carrosAdquiribles(double p){
        ListIterator<Vehiculo>itr = lista.listIterator();
        while(itr.hasNext()){
            Vehiculo pick = itr.next();
            if((pick.getPrecio())<=p){
                System.out.println(pick.toString());
            }

        }



    }

    public void mayorRendimiento(){
        ListIterator<Vehiculo>itr = lista.listIterator();
        int pos=0;
        double max=0;
        while(itr.hasNext()){
            Vehiculo pick = itr.next();
            if(pick.rendimientoTotal()>max){
                max=pick.rendimientoTotal();
                pos=(itr.nextIndex()-1);
            }
        }
        System.out.println(lista.get(pos).toString());

    }

    public String toString(){
        ListIterator<Vehiculo>itr = lista.listIterator();
        String returnstring = "";
        int pos=1;
        while(itr.hasNext()){
            Vehiculo pick = itr.next();
            returnstring+=pos+".\n------------------------------------------------\n"+ pick.toString() + "\n";
            pos++;
        }
        return returnstring;
    }

    public void muestraPickups(){
        ListIterator<Vehiculo>itr = lista.listIterator();
        while(itr.hasNext()){
            Vehiculo pick = itr.next();
            if(pick instanceof Pickup){
                System.out.println(pick.toString());
            }
        }
    }

}
