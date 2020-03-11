public class Corona {
    public static void main(String[] args) {

        //pole
        State[] states = {new State("1", 1, 1, 1, 1),
                new State("2", 2, 2, 2, 2),
                new State("3",3,3,3,3),
                new State("4",4,4,4,4),
                new State("5",5,5,5,5)
        };

        //cyklus pro výpis
        for(State state: states)
            System.out.printf("State : %s\nnumber of Infected %d\nnumber of death %d\n\n",state.getName(),state.getNumberOfInfected(),state.getNumberOfDeath());
    }
}
