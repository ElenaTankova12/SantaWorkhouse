package santaworkshop.factorymethod;

public class Doll implements Toy {

    private String name;

    @Override
    public void introduceMe() {
        System.out.println("I am Doll object");
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }

}
