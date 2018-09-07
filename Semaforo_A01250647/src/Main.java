import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {   int opcion;
        Scanner input = new Scanner(System.in);
        Semaforo sem1 = new Semaforo();
        Semaforo sem2 = new Semaforo();

        do {
            System.out.print("MENU\n1. Encender/Apagar semaforo 1\n2. Aplastar botton semaforo 1\n3. Encender/Apagar semaforo 2\n4. Aplastar" +
                    " boton semaforo 2\n5. Salir\nOpcion: ");
            opcion = input.nextInt();

            switch (opcion)
            {
                case 1:
                    sem1.setEncendido();
                    if(sem1.getEncendido())
                        System.out.println("Semaforo 1 encendido");
                    else
                        System.out.println("Semaforo 1 apagado");
                    break;

                case 2:
                    if(sem1.getEncendido())
                    {
                        sem1.funcionamiento();
                    }else{
                        System.out.println("Semaforo 1 apagado");
                    }
                    break;

                case 3:
                    sem2.setEncendido();
                    if(sem2.getEncendido())
                        System.out.println("Semaforo 2 encendido");
                    else
                        System.out.println("Semaforo 2 apagado");
                    break;

                case 4:
                    if(sem2.getEncendido())
                    {
                        sem2.funcionamiento();
                    }else{
                        System.out.println("Semaforo 2 apagado");
                    }
                    break;


            }
        }while(opcion!=5);

        input.close();
    }
}
