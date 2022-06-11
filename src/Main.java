import santaworkshop.command.NeedBikeMagicWordOperation;
import santaworkshop.command.NeedDollMagicWordOperation;
import santaworkshop.factorymethod.Toy;
import santaworkshop.factorymethod.ToyFactory;
import santaworkshop.observer.Dwarf;
import santaworkshop.observer.Workshop;
import santaworkshop.singleton.SantaClause;

public class Main {
    public static void main(String[] args) {


        SantaClause santaClause = SantaClause.getInstance();// singleton
        String bike = santaClause.sayMagicWord(new NeedBikeMagicWordOperation()); // command

        ToyFactory toyFactory = new ToyFactory(); // factory method
        Toy bikeToy = toyFactory.createToy(bike);
        bikeToy.setName("BMX");
        bikeToy.introduceMe();

        Workshop workshop = new Workshop(); //observer
        Dwarf thinDwarf = new Dwarf("Thin");
        Dwarf fatDwarf = new Dwarf("Fat");
        Dwarf goshoDwarf = new Dwarf("Gosho");
        workshop.addObserver(thinDwarf);
        workshop.addObserver(fatDwarf);
        workshop.addObserver(goshoDwarf);

        workshop.setToy(bikeToy);


        String doll = santaClause.sayMagicWord(new NeedDollMagicWordOperation());
        Toy dollToy = toyFactory.createToy(doll);
        dollToy.setName("Barby");
        dollToy.introduceMe();

        workshop.setToy(dollToy);


    }
}