/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch04;

/**
 *
 * @author 19502
 */
public class Car {
    
    private int age;
    private String brand;
    private double price;
    
    public Car(int someAge, String someBrand, double somePrice){
        age = someAge;
        brand = someBrand;
        price = somePrice;
    }
    
    public String getBrand(){
        return brand;
    }
    
    public int getAge(){
        return age;
    }
    
    public double getPrice(){
        return price;
    }
    
    public void discount(){
        price *= 0.8;
    }
    
}
