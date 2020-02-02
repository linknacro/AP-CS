
class AirlineTicket implements Comparable<AirlineTicket> {

    public int cost;
    public int stopovers;

    public AirlineTicket(int cost, int stopovers) {
        this.cost = cost;
        this.stopovers = stopovers;
    }

    public int getCost() {
        return cost;
    }

    public int compareTo(AirlineTicket o) {
        return this.cost - o.getCost();
    }
    
    public String toString(){
        return "Price of ticket: " + cost + "\tNumber of Stopovers: " + stopovers; 
    }
}
