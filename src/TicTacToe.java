import java.util.Arrays;

public class TicTacToe {
    private String[][] gameField;
    private boolean isGameStarted;
    private boolean isX;

    private void clearField() {
        Arrays.fill(gameField[0], "-");
        Arrays.fill(gameField[1], "-");
        Arrays.fill(gameField[2], "-");
    }

    public TicTacToe() {
        newGame();
    }

    public void newGame() {
        gameField = new String[3][3];
        clearField();
        isGameStarted = true;
        isX = true;
    }

    public String[][] getField() {
        return gameField;
    }

    public String makeMove(int x, int y) {
        int inX = x - 1;
        int inY = y - 1;

        if (!isGameStarted) {
            return "Game was ended";
        }

        if (!gameField[inX][inY].equals("-")) {
            return "Cell " + x + ", " + y + " is already occupied";
        }

        String res = "Move completed";
        if (!isX) {
            gameField[inX][inY] = "0";
        } else {
            gameField[inX][inY] = "X";
        }
        isX = !isX;

        String resGame = checkGame();
        if (resGame != null) {
            if (resGame.equals("X") || resGame.equals("0")) {
                res = "Player " + resGame + " won";
                isGameStarted = false;
            } else if (resGame.equals("D")) {
                res = "Draw";
                isGameStarted = false;
            }
        }
        return res;
    }

    public String checkGame() {

        boolean isDraw = true;
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                if (gameField[i][j].equals("-")) {
                    isDraw = false;
                    break;
                }
            }
        }
        if (isDraw) {
            return "D";
        }

        int moveCounter = 0;
        for (int i = 0; i < gameField.length; i++) {
            moveCounter = 1;
            String firstCh = gameField[i][0];
            for (int j = 1; j < gameField[i].length; j++) {
                if (gameField[i][j].equals(firstCh)) {
                    moveCounter++;
                }
            }
            if (moveCounter == 3) {
                return firstCh;
            }
        }

        for (int i = 0; i < gameField.length; i++) {
            moveCounter = 1;
            String firstCh = gameField[0][i];
            for (int j = 1; j < gameField.length; j++) {
                if (gameField[j][i].equals(firstCh)) {
                    moveCounter++;
                }
            }
            if (moveCounter == 3) {
                return firstCh;
            }
        }

        moveCounter = 1;
        String firstCh = gameField[0][0];
        for (int i = 1; i < gameField.length; i++) {
            if (firstCh.equals(gameField[i][i])) {
                moveCounter++;
            }
        }
        if (moveCounter == 3) {
            return firstCh;
        }

        moveCounter = 1;
        firstCh = gameField[0][gameField.length - 1];
        for (int i = 1; i < gameField.length; i++) {
            if (firstCh.equals(gameField[i][gameField.length - 1 - i])) {
                moveCounter++;
            }
        }
        if (moveCounter == 3) {
            return firstCh;
        }
        return null;
    }
}
