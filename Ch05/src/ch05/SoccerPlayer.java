
class SoccerPlayer implements Comparable<SoccerPlayer> {

    String name;
    int jersey;

    SoccerPlayer(String name, int jersey) {
        this.name = name;
        this.jersey = jersey;
    }

    public int getJersey(){
        return jersey;
    }
    public int compareTo(SoccerPlayer st) {
        return this.jersey - st.getJersey();
    }
    
    public String toString() {
        return jersey + "  " + name;
    }
}
