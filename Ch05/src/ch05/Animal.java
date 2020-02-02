
public class Animal implements Comparable<Animal> {

    public String name;
    public int avgWeight;
    public String population;

    public Animal(String name, int avgWeight) {
        this.name = name;
        this.avgWeight = avgWeight;
    }

    @Override
    public int compareTo(final Animal o) {
        return Integer.compare(this.avgWeight, o.avgWeight);
    }

    public String toString() {
        return avgWeight + " pounds \t" + "\t" + name;
    }
}
