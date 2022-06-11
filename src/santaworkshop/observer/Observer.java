package santaworkshop.observer;

import santaworkshop.factorymethod.Toy;

@FunctionalInterface
public interface Observer {

    void update(Toy toy);
}
