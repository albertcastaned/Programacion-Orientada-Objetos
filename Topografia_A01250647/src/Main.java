import java.util.Scanner;
public class Main{
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    //Maximo 50 puntos en vertice
    Vertice vertices[] = new Vertice[50];
    int opcion,posicion=0,posx,posy,sumatoria1=0,sumatoria2=0,area;
    do {
        System.out.println("MENU\n1. Ingresar nuevo punto de vertice\n2. Calcular area y precio\n3. Salir");
        opcion = input.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese la posicion x en metros del punto");
                posx=input.nextInt();
                System.out.println("Ingrese la posicion y en metros del punto");
                posy=input.nextInt();

                vertices[posicion]=new Vertice(posx,posy);
                posicion++;
                break;


            case 2:
                for(int i=0;i<(posicion-1);i++)
                {
                    sumatoria1+=vertices[i].getX()*vertices[i+1].getY();
                }
                sumatoria1+=vertices[posicion-1].getX()*vertices[0].getY();

                for(int i=0;i<(posicion-1);i++)
                {
                    sumatoria2+=vertices[i].getY()*vertices[i+1].getX();
                }
                sumatoria2+=vertices[posicion-1].getY()*vertices[0].getX();
                area=Math.abs((sumatoria1-sumatoria2)/2);
                System.out.println("El area total es de "+area+" metros cuadrados y el costo es de $"+area*20);


        }
    }while(opcion!=3);
    input.close();




    }
}
