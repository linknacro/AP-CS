
class MovieProducer implements Comparable<MovieProducer> {

    private String firstName;
    private String lastName;
    private int age;
    private int numMoviesProduced;

    public MovieProducer(String firstName,
            String lastName,
            int age,
            int numMoviesProduced) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.numMoviesProduced = numMoviesProduced;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
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

    public int getNumMovies(){
        return numMoviesProduced;
    }
    public int compareTo(MovieProducer o) {
        return numMoviesProduced - o.getNumMovies();
    }

    public String toString() {
        return numMoviesProduced + "\t" + lastName + ", " + firstName;
    }
}
