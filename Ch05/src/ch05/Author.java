
class Author implements Comparable<Author> {

    String firstName;
    String lastName;
    int numOfPublishedBooks;
    /*
      Lots of othter instance variables not shown
    */
    
    public Author (String firstName, String lastName, int numOfPublishedBooks){
        this.firstName = firstName;
        this.lastName = lastName;
        this.numOfPublishedBooks = numOfPublishedBooks;
    }
    
    
    private String getLastName(){
        return lastName;
    }
    
    public int compareTo(Author aut){
        return this.lastName.compareTo(aut.getLastName());
    }
    
    public String toSTring(){
        return lastName + ", " + firstName + "\t" + numOfPublishedBooks;
    }
    
    
}
