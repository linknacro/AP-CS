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
public class BandBooster {
    
    private String name;
    private int boxesSold;
    
    public BandBooster(String dudeName){
        name = dudeName;
        boxesSold = 0;
    }
    
    public String getName(){
        return name;
    }
    
    public void updateSales(int amt){
        boxesSold += amt;
    }
    
    public String toString(){
        return name + ": " + boxesSold + " boxes";
    }
}
