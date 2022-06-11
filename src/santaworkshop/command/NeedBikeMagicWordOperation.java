package santaworkshop.command;

public class NeedBikeMagicWordOperation implements MagicWordOperation {

    private MagicBoard magicBoard = new MagicBoard();
    @Override
    public String execute() {
        return magicBoard.showBike();
    }

}
