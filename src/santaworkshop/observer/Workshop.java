package santaworkshop.observer;

import santaworkshop.factorymethod.Toy;

import java.util.ArrayList;
import java.util.List;

public class Workshop {

    private Toy toy;
    private List<Dwarf> dwarves = new ArrayList<>();

    public void addObserver(Dwarf dwarf) {
        //As it is in task description
        if (dwarves.size() > 3) {
            System.out.println("Can't have more than 3 dwarves!");
        }
        this.dwarves.add(dwarf);
    }

    public void removeObserver(Dwarf dwarf) {
        this.dwarves.remove(dwarf);
    }

    public void setToy(Toy toy) {
        this.toy = toy;
        for (Dwarf dwarf : this.dwarves) {
            System.out.println("Notified Dwarf with name: " + dwarf.getName() + " for new toy " + toy.getName());
            dwarf.update(toy);
        }
    }

}
