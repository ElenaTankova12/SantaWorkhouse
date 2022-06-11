package santaworkshop.command;

public class NeedDollMagicWordOperation implements MagicWordOperation {

    private MagicBoard magicBoard = new MagicBoard();
    @Override
    public String execute() {
        return magicBoard.showDoll();
    }

}
