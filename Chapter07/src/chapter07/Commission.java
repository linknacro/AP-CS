/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter07;

/**
 *
 * @author 19502
 */
public class Commission extends Hourly
{

    private double totalSales = 0;
    private double comRate;

    public Commission(String name, String address, String phone, String security, double payRate, double comRate)
    {
        super(name, address, phone, security, payRate);
        this.comRate = comRate;
    }

    public void addSales(double Sales)
    {
        totalSales += Sales;
    }

    public double pay()
    {
        double payment = super.pay() + totalSales * comRate;
        totalSales = 0;
        return payment;
    }

    public String toString()
    {
        return super.toString() + "\nTotal Sales: " + totalSales;
    }
}
