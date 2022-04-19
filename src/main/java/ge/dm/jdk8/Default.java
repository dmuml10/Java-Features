package ge.dm.jdk8;

public class Default {



}

interface Vehicle {

    static String producer() {
        return "N&F Vehicles";
    }

    default String getOverview() {
        return "ATV made by " + producer();
    }
}
