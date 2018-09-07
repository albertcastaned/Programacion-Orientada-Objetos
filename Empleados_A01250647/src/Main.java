import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int opcion;
        Nomina nom = new Nomina();

        do{
            System.out.println("MENU\n1. Agregar empleado\n2. Borrar empleado\n3. Calcular pago mensual\n4. Incrementar salario de planta\n5. Imprimir informacion de empleados\n6. Imprimir empleados con horas extras\n7. Salir\nOpcion: ");
            opcion = input.nextInt();
            input.nextLine();
            switch(opcion){
                case 1:
                    System.out.println("Escriba el nombre del empleado");
                    String name = input.nextLine();
                    System.out.println("Escriba el ID del empleado");
                    int id=input.nextInt();
                    System.out.println("Oprima 1 si es empleado de planta o 2 si es pagado por hora");
                    int o=input.nextInt();
                    if(o==1){
                        System.out.println("Escriba el salario mensual");
                        double sal = input.nextDouble();
                        nom.agregarEmpleado(new Planta(id,name,sal));
                    }else{
                        System.out.println("Escriba las horas de trabajo");
                        int ho=input.nextInt();
                        System.out.println("Escriba la cuota por hora");
                        double cu=input.nextDouble();
                        nom.agregarEmpleado(new PorHora(id,name,ho,cu));
                    }
                    break;

                case 2:
                    System.out.println("Escriba el ID del empleado");
                    int ID=input.nextInt();
                    nom.borrarEmpleado(ID);
                    break;

                case 3:
                    System.out.println(nom.pagoMensual());
                    break;

                case 4:
                    System.out.println("Escriba un porcentaje");
                    double x = input.nextDouble();
                    nom.incrementarPago(x);
                    break;

                case 5:
                    System.out.println(nom.toString());
                    break;

                case 6:
                    System.out.println("Empleados con horas extras: "+nom.horasExtra());
                    break;



            }





        }while(opcion!=7);



        input.close();




    }
}
