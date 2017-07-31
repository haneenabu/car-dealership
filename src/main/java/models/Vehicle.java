package models;

public class Vehicle {
    public int year;
    public String brand;
    public String model;
    public int miles;
    public int price;

    public Vehicle(int year, String brand, String model, int miles, int price) {
        year = year;
        brand = brand;
        model = model;
        miles = miles;
        price = price;
    }

        public boolean worthBuying(int maxPrice){
            return(price <maxPrice);
        }
}