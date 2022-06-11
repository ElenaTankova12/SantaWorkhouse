package santaworkshop.observer;

import santaworkshop.factorymethod.Toy;

public class Dwarf implements Observer {

    private String name;
    private Toy toy;

    public Dwarf(String name) {
        this.name = name;
    }


    @Override
    public void update(Toy toy) {

        this.setToy(toy);
    }

    public String getName() {
        return name;
    }

    public void setToy(Toy toy) {
        this.toy = toy;
    }

    public Toy getToy() {
        return toy;
    }
}
