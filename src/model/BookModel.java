/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class BookModel {
    
   
    private String bookId;
    private String name;
    private double price;
    private String language;
    private String category;
    private String author;
    
    
    
    public String getbookId(){
       return bookId; 
    }
    public void setbookId(String bookId){
        this.bookId=bookId;
    }
    
    
    
    
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    
    
    
    
    
    public double getprice(){
        return price;
    }
    public void setprice(double price){ 
        this.price=price;
    }
    
    
    
    
    public void setlanguage(String language){
        this.language=language;
    }    
    public String getlanguage(){
        return language;
    }
    
    
    
    public void setcategory(String category){
        this.category=category;
    }      
    public String getcategory(){
        return category;
    }
    
    
    
    public void setauthor(String author){
        this.author=author;
    }       
    public String getauthor(){
        return language;
    }
    
    

    
    
    
    
 
    
}
