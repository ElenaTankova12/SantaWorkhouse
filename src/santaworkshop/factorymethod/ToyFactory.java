package santaworkshop.factorymethod;

public class ToyFactory {

    public Toy createToy(String toy) {
        if (toy == null || toy.isEmpty()) {
            return null;
        }

        switch (toy) {
            case "Bike":
                return new Bike();
            case "Doll":
                return new Doll();
            default:
                throw new IllegalArgumentException("Unknown toy " + toy);
        }
    }
}
