/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author Muhammad Fakhruddin
 */
public class Car {
String brand;

//your constructor here
Car()
{
this.brand = "Proton X70";
}
//write method getBrand here
public void getBrand()
{
System.out.println(brand);
}

void run() 
{
System.out.println("Car is running...");

}

public static void main(String[] args) 
{
    Car c = new Car();
    c.run();
    c.getBrand();		//Call method getBrand and print the value		
}
}