

class Friend implements Comparable<Friend>{

    String firstName;
    String lastName;
    int numYearsKnown;
    /*
      Lots of othter instance variables not shown
    */
    
    public Friend (String firstName, String lastName, int numYearsKnown){
        this.firstName = firstName;
        this.lastName = lastName;
        this.numYearsKnown = numYearsKnown;
    }
    
    private String getLastName(){
        return lastName;
    }

    public int compareTo(Friend f){
        return this.lastName.compareTo(f.getLastName());
    }
    
    public String toString() {
        return lastName + ", " + firstName  + "   known " + numYearsKnown + " years ";
    }
    
    
    
    
}
