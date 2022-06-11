package santaworkshop.factorymethod;

public class Bike implements Toy {

    private String name;

    public Bike() {

    }

    @Override
    public void introduceMe() {
        System.out.println("I am Bike object");
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
