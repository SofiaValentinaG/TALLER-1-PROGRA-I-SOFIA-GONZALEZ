package co.edu.uptc.taller.main;
import java.util.Scanner;

import co.edu.uptc.operations.services.CarServices;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CarServices service = new CarServices(); // crea el objeto Car services

        int option = 0;

        do {

               System.out.println("\n===== MENU =====");
            System.out.println("1. Crear carro");
            System.out.println("2. Consultar carro por ID");
            System.out.println("3. Actualizar carro");
               System.out.println("4. Eliminar carro");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            option = sc.nextInt();
            sc.nextLine(); 

            switch(option) {

             case 1:
                    service.createCar(); // llama al metodo de la clase Carservices
                    break;
             case 2:
                    service.consultCar();
                    break;

             case 3:
                    service.updateCar();
                    break;

                case 4:
                    service.deleteCar();
                    break;

                case 5:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while(option != 5);

        sc.close();
    }
}