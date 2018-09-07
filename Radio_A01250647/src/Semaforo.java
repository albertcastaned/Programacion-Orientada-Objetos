public class Semaforo {
    private boolean encendido;
    private int color; //0 es verde, 1 es amarillo, 2 es rojo
    private int tiempo;



    public Semaforo()
    {
        encendido=false;
        color=0;
        tiempo=3000;
    }

    public Semaforo(boolean e, int c,int t)
    {
        encendido=e;
        color=c;
        tiempo=t;
    }

    public boolean getEncendido()
    {
        return encendido;
    }

    public void setEncendido()
    {
        encendido=!encendido;
    }

    public int getColor()
    {
        return color;
    }

    public void setColor(int color)
    {
        this.color=color;
    }
    public int setTiempo()
    {
        return tiempo;
    }
    public void getTiempo(int tiempo)
    {
        this.tiempo=tiempo;
    }

    public void funcionamiento() {
            color=0;
            do {
                if (color == 0) System.out.println("Verde");
                if (color == 1) System.out.println("Amarillo");
                if (color == 2) System.out.println("Rojo");
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                color++;
            }while(color!=3);

    }
}