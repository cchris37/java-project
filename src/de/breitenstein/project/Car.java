package de.breitenstein.project;

public class Car {
    //Attribute/Eigenschaften
    private String color; //Farbe
    private String brand; //Marke
    private int horsePower; //PS-Zahl

    public Car() {
        System.out.println("auto wurde erzeugt");
    }

    public Car(String color, String brand, int horsePower){ // Konstruktor
        this.color = color;
        this.brand = brand;
        this.horsePower = horsePower;
    }


    //Methoden
    public void drive(int speed) {
        System.out.println("Das Auto fährt...." + speed + "km/h");
    }
    public void drive() { //Methoden überladen
        System.out.println("Das Auto fährt....");
    }

    public void drive(int speed, String name) { //Methoden überladen
        System.out.println("Das Auto fährt...." + speed + "km/h" + " von " + name);
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }
}
