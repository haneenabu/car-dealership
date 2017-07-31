package models;
//import java.io.Console;
//import java.io.models.Vehicle;

public class App {
    public static void main(String[] args) {
        Vehicle hatchback = new Vehicle();
        hatchback.year = 1994;
        hatchback.brand = "Subaru";
        hatchback.model = "Legacy";
        hatchback.miles = 170000;
        hatchback.price = 4000;

        Vehicle suv = new Vehicle();
        suv.year = 2002;
        suv.brand = "Ford";
        suv.model = "Explorer";
        suv.miles = 100000;
        suv.price = 7000;

        Vehicle sedan = new Vehicle();
        sedan.year = 2015;
        sedan.brand = "Toyota";
        sedan.model = "Camry";
        sedan.miles = 50000;
        sedan.price = 30000;

        Vehicle truck = new Vehicle();
        truck.year = 1999;
        truck.brand = "Ford";
        truck.model = "Ranger";
        truck.miles = 100000;
        truck.price = 4000;

        Vehicle crossover = new Vehicle();
        crossover.year = 1998;
        crossover.brand = "Toyota";
        crossover.model = "Rav-4";
        crossover.miles = 200000;
        crossover.price = 3500;

        Vehicle[] allVehicles = {hatchback, suv, sedan, truck, crossover};

        System.out.println("All Vehicles:");

        for ( Vehicle individualVehicle : allVehicles ) {
            System.out.println( "----------------------" );
            System.out.println( individualVehicle.year );
            System.out.println( individualVehicle.brand );
            System.out.println( individualVehicle.model );
            System.out.println( individualVehicle.miles );
            System.out.println( individualVehicle.price );
        }
    }
}
