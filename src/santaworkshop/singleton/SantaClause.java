package santaworkshop.singleton;

import santaworkshop.command.MagicBoard;
import santaworkshop.command.MagicWordOperation;

public class SantaClause {

    private static MagicBoard magicBoard = new MagicBoard();

    private static SantaClause santaClauseInstance = null;

    private SantaClause(MagicBoard magicBoard) {
        magicBoard.create();
    }

    public static SantaClause getInstance() {
        if (santaClauseInstance == null) {
            System.out.println("Santa clause is ready for magic!");
            santaClauseInstance = new SantaClause(magicBoard);
        }
        return santaClauseInstance;
    }

    public String sayMagicWord(MagicWordOperation magicWordOperation) {
        return magicWordOperation.execute();
    }
}
