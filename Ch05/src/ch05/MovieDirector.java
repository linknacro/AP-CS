
class MovieDirector {

    private String firstName;
    private String lastName;
    private int age;
    private int numMoviesDirected;

    public MovieDirector(String firstName,
            String lastName,
            int age,
            int numMoviesDirected) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.numMoviesDirected = numMoviesDirected;
    }

    public int getNumMoviesDirected(){
        return numMoviesDirected;
    }
    
    public int compareTo(MovieDirector md){
        return this.numMoviesDirected - md.getNumMoviesDirected();
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDirectorsLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return numMoviesDirected + "\t" + lastName + ", " + firstName;
    }
}
