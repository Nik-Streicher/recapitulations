public class State {

    private String name;
    private int population;
    private int numberOfInfected;
    private int numberOfDeath;
    private int numberOfCured;

    public State(String name,int population,int numberOfInfected,int numberOfDeath,int numberOfCured){
        this.name = name;
        this.population = population;
        this.numberOfInfected = numberOfInfected;
        this.numberOfDeath = numberOfDeath;
        this.numberOfCured = numberOfCured;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfDeath() {
        return numberOfDeath;
    }

    public int getNumberOfInfected() {
        return numberOfInfected;
    }
}
