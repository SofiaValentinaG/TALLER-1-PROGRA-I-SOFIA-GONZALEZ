package co.edu.uptc.operations.services;

import java.util.ArrayList;
import java.util.Scanner;

import co.edu.uptc.taller.enums.*;
import co.edu.uptc.taller.models.*;

import java.time.LocalDate;

public class CarServices {

private ArrayList<Car> cars = new ArrayList<>();
 private Scanner sc = new Scanner(System.in);

    // Crear el carro
 //-----------------------------------------------------------------------------------------
    public void createCar(){
    	//inicializa las variables

        TypeVehicle typeVehicle = null;
        float weight = 0;
          float maxSpeed = 0;
        FuelType fuelType = null;
           Company company = null;
        Motor motor = null;

     System.out.println("Seleccione tipo de vehiculo:");
        System.out.println("1. Camioneta");
       System.out.println("2. Deportivo");
        System.out.println("3. Electrico");
        int option = sc.nextInt();
        sc.nextLine();

        switch(option){

            case 1:
            	

              typeVehicle = TypeVehicle.SUV;
               weight = 2900;
                maxSpeed = 180;
                fuelType = FuelType.DIESEL;
                //crea el objeto

                company = new Company("C01etyrgrygry","Ford","USA","123456464","Detroit");
                motor = new Motor("M01","TRK01",250,400,LocalDate.of(2022,1,1));

                break;

            case 2:

             typeVehicle = TypeVehicle.SPORTS;
                weight = 1400;
                maxSpeed = 320;
                fuelType = FuelType.GASOLINE;

                company = new Company("C0266666","Ferrari","Italia","99999","Maranello");
             motor = new Motor("M02","SPT01",500,600,LocalDate.of(2023,1,1));

                break;

            case 3:

              typeVehicle = TypeVehicle.ELECTRIC;
                  weight = 1800;
               maxSpeed = 250;
                fuelType = FuelType.ELECTRIC;

                company = new Company("C03","Tesla","USA","88888","Austin");
                motor = new Motor("M03","ELC01",350,500,LocalDate.of(2024,1,1));

                break;
        }
        //el cliente añade los atributos al carroo

       

        System.out.println("ID Car:");
        
        String idCar = sc.nextLine();
        for (Car c : cars) {
            if (c.getIdCar().equals(idCar)) {
                System.out.println(" ID ya existe");
                return;
            }
        }

        System.out.println("Marca:");
        String brand = sc.nextLine();

   System.out.println("Modelo:");
        String model = sc.nextLine();
//PARA validar el precio --------------------------------
  
        float price;
      
        while (true) {
            try {
                System.out.println("Precio:");
                price = Float.parseFloat(sc.nextLine());

                if (price >= 0) break;
                else System.out.println("No puede ser negativo");

            } catch (Exception e) {
                System.out.println("Ingrese un número válido");
            }
        }

// Validar Color -------------------------------------
     Color color = null;
     while (true) {
         try {
             System.out.println("Color (RED, GREEN, DARKBLUE, WHITE, DARK):");
             color = Color.valueOf(sc.nextLine().toUpperCase());
             break;
         } catch (Exception e) {
             System.out.println(" Color inválido");
         }
     }

        LocalDate date = LocalDate.now();

        // el cliente ingresa sus atributos

        System.out.println("ID Owner:");
        String idOwner = sc.nextLine();

        System.out.println("Nombre:");
        String name = sc.nextLine();

        System.out.println("Telefono:");
        String phone = sc.nextLine();

        System.out.println("Direccion:");
        String address = sc.nextLine();

       // validar email-----------------------------------------
        String email;
        while (true) {
            System.out.println("Email:");
            email = sc.nextLine();

            if (email.contains("@")) break;
            else System.out.println("❌ Email inválido");
        }

        Owner owner = new Owner(idOwner,name,phone,address,email);

        Car car = new Car( "6367383",typeVehicle,weight,maxSpeed,fuelType, idCar, brand,model,date, price,color,company,owner,motor);
        company.getCars().add(car);// añade el objeto al arraylist de company

        cars.add(car); // añade el objeto car a la lista cars

        System.out.println("Carro creado correctamente");

    }

    // consultar el carro que ingreso el cliente por id---------------------------------------
    public void consultCar(){

        System.out.println("Ingrese ID del carro:");
        String id = sc.nextLine();

        for(Car car : cars){ // itera las lista cars de objeto Car

            if(car.getIdCar().equals(id)){

                
            	System.out.println("=================================");
            	System.out.println("        CARRO ENCONTRADO        ");
            	System.out.println("=================================\n");
           
                System.out.println("Marca: " + car.getBrand());
                System.out.println("Modelo: " + car.getModel());
            System.out.println("Precio: " + car.getPrice());
                System.out.println("Tipo: " + car.getTypeVehicle());
                System.out.println("Tipo gasolina: " + car.getFuelType());
                System.out.println("\n========== PROPIETARIO ==========");
                System.out.println("ID        : " + car.getOwner().getIdOwner());
                System.out.println("Nombre    : " + car.getOwner().getName());
             System.out.println("Teléfono  : " + car.getOwner().getTelephone());
                System.out.println("Dirección : " + car.getOwner().getAdress());
                System.out.println("Email     : " + car.getOwner().getEmail());
                
             	System.out.println("======================================================");
            	System.out.println("        CARACTERISTICAS ASOCIADAS AL TIPO DE CARRO      ");
            	System.out.println("========================================================\n");
            	System.out.println("\n========== COMPAÑIA ==========");

           
            	System.out.println("Nombre    : " + car.getCompany().getName());
          
          System.out.println("Teléfono  : " + car.getCompany().getTelephone());
            	System.out.println("Ciudad    : " + car.getCompany().getCity());
            	
            	System.out.println("\n========== MOTOR ==========");

            	System.out.println("Año de fabricacion       : " + car.getMotor().getFabricationYear());
            
            	System.out.println("Potencia  : " + car.getMotor().getPower());
            	System.out.println("Torque    : " + car.getMotor().getTorque());
            	System.out.println("id motor     : " + car.getMotor().getEngineId());
            	
            	
                
                
                
               
                return;
            }
        }

        System.out.println("Carro no encontrado");

    }

    // actualizar el carro -----------------------------------------------------------
    public void updateCar(){

        System.out.println("Ingrese ID del carro:");
        String id = sc.nextLine();

        for(Car car : cars){

      if(car.getIdCar().equals(id)){ // obtiene el objeto de la lista por el id

           System.out.println("Nuevo precio:");
                float price = sc.nextFloat();
             sc.nextLine();
             car.setPrice(price); // modifica el precio del carro
            
             Color color;
             while (true) {
                 try {
                     System.out.println("Color (RED, GREEN, DARKBLUE, WHITE, DARK):");
                     color = Color.valueOf(sc.nextLine().toUpperCase());
                     car.setColor(color);
                     break;
                 } catch (Exception e) {
                     System.out.println("Color inválido");
                 }
             }

            
             System.out.println("Nuevo modelo");
             String model=sc.nextLine();
             car.setModel(model);
             
             
             System.out.println("Carro actualizado");
             
         	System.out.println("=================================");
        	System.out.println("        NUEVOS DATOS CARRO       ");
        	System.out.println("=================================\n");
       
            System.out.println("Precio: " + car.getPrice());
            System.out.println("Color: " + car.getColor());
        System.out.println("Modelo : " + car.getModel());
           
             
             System.out.println("¿Desea modificar atributos de la compañia?, ingrese si o no");
             String option= sc.nextLine();
             if(option.equalsIgnoreCase("si")) {
            	 Company company= new Company();
            	 System.out.println("Ingrese nombre de la compañia");
      
            	 String name=sc.nextLine();
             	 System.out.println("Ingrese telefono de la compañia");
             	 String telephone=sc.nextLine();
             	 System.out.println("Ingrese la ciudad de la compañia");
             	 String city= sc.nextLine();
             	 
             	 company.setName(name);
             	 company.setTelephone(telephone);
             	 company.setCity(city);
             	car.setCompany(company);
             	System.out.println("=================================");
            	System.out.println("        NUEVOS DATOS COMPAÑIA       ");
            	System.out.println("=================================\n");
           
                System.out.println("Nombre: " + company.getName());
                System.out.println("Telefono: " + company.getTelephone());
            System.out.println("Direccion: " + company.getCity());
               
             	 
             	 
             }else {
                  return;
             }
             
             

                return;
            }
        }

        System.out.println("Carro no encontrado");

    }

    // eliminar el carro------------------------------------------------------------------
    public void deleteCar(){

        System.out.println("Ingrese ID del carro:");
        String id = sc.nextLine();

        for(int i = 0; i < cars.size(); i++){ //ciclo que itera el tamaño de la lista cars

            if(cars.get(i).getIdCar().equals(id)){ //obtiene cada objeto de la lista por el id

                cars.remove(i);// metodo de arraylist que elimina objetos de la lista
                System.out.println("Carro eliminado");
                return;

            }
        }

        System.out.println("Carro no encontrado");

    }
}