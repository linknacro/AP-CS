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
public class Book {
    
    private int numPages;
    private String title;
    private String author;
    
    public Book(){
        numPages = 400;
        title = "A Farewell to Arms";
        author = "Ernest Hemingway";
    }
    
    public int getNumPages(){
        return numPages;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
}
