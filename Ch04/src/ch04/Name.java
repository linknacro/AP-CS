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
public class Name {
    
    private String firstName;
    private String middleName;
    private String lastName;
    
    public Name(String first, String middle, String last){
        firstName = first;
        middleName = middle;
        lastName = last;
    }
    
    public String getFirst(){
        return firstName;
    }
    
    public String getMiddle(){
        return middleName;
    }
    
    public String getLast(){
        return lastName;
    }
    
    public String firstMiddleLast(){
        return firstName + " " + middleName + " " + lastName;
    }
    
    public String lastFirstMiddle(){
        return lastName + ", " + firstName + " " + middleName;
    }
    
    public boolean equals(Name otherName){
        return (otherName.getFirst().equalsIgnoreCase(firstName) && otherName.getMiddle().equalsIgnoreCase(middleName) && otherName.getLast().equalsIgnoreCase(lastName));
    }
    
    public String initials(){
        return ("" + firstName.charAt(0) + middleName.charAt(0) + lastName.charAt(0)).toUpperCase();
    }
    
    public int length(){
        return firstName.length() + middleName.length() + lastName.length();
    }
    
    public String toString(){
        return firstName + " " + middleName + " " + lastName;
    }
    
    
}
