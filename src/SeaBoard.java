import java.util.Arrays;

public class SeaBoard {
    private String[][] field;

    public SeaBoard() {
        field = new String[10][10];
        for (int i = 0; i < field.length; i++) {
            Arrays.fill(field[i], ".");
        }
    }

    public String[][] getField() {
        return field;
    }

    public void shoot(int line, int column, String issue) {
        if (!".".equals(field[line][column])) return;

        if ("m".equals(issue)) {
            field[line][column] = "#";
        } else if ("h".equals(issue)) {
            field[line][column] = "x";
        } else if ("d".equals(issue)) {
            field[line][column] = "x";
            int[][] lBoard = getBoardCoordinates(line, column);
        }
    }

    private int[][] getBoardCoordinates(int line, int column) {
        boolean isVertical = true;
        int[][] resMass = new int[4][2];

        if (!(column == 0)) {
            if (field[line][column - 1].equals("x")) {
                isVertical = false;
            }
        }
        if (!(column == 9) && isVertical) {
            if (field[line][column + 1].equals("x")) {
                isVertical = false;
            }
        }

        int currPos = 0;
        int startPos = 0;
        int endPos = 0;

        if (isVertical) {
            currPos = line;
            while (currPos >= 0) {
                if (!field[currPos][column].equals("x")) break;

                if (column > 0) {
                    field[currPos][column-1] = "#";
                }
                if (column < 9) {
                    field[currPos][column+1] = "#";
                }

                currPos--;
            }
            startPos = currPos;
            if (startPos != -1) {
                if (column > 0) {
                    field[currPos][column-1] = "#";
                }
                if (column < 9) {
                    field[currPos][column+1] = "#";
                }
                field[currPos][column] = "#";

                currPos = line;
                while (currPos <= 9) {
                    if (!field[currPos][column].equals("x")) break;

                    if (column > 0) {
                        field[currPos][column-1] = "#";
                    }
                    if (column < 9) {
                        field[currPos][column+1] = "#";
                    }

                    currPos++;
                }
                endPos = (currPos==line)?currPos+1:currPos;
                if (endPos != 10) {
                    if (column > 0) {
                        field[endPos][column-1] = "#";
                    }
                    if (column < 9) {
                        field[endPos][column+1] = "#";
                    }
                    field[endPos][column] = "#";
                }
            }
        } else {
            currPos = column;
            while (currPos >= 0) {
                if (!field[line][currPos].equals("x")) break;

                if (line > 0) {
                    field[line - 1][currPos] = "#";
                }
                if (line < 9) {
                    field[line + 1][currPos] = "#";
                }

                currPos--;
            }
            startPos = currPos;
            if (startPos != -1) {
                if (line > 0) {
                    field[line - 1][currPos] = "#";
                }
                if (line < 9) {
                    field[line + 1][currPos] = "#";
                }
                field[line][currPos] = "#";
            }

            currPos = column;
            while (currPos <= 9) {
                if (!field[line][currPos].equals("x")) break;

                if (line > 0) {
                    field[line - 1][currPos] = "#";
                }
                if (line < 9) {
                    field[line + 1][currPos] = "#";
                }

                currPos++;
            }
            endPos = currPos;
            if (endPos != 10) {
                if (line > 0) {
                    field[line - 1][currPos] = "#";
                }
                if (line < 9) {
                    field[line + 1][currPos] = "#";
                }
                field[line][currPos] = "#";
            }
        }

        System.out.println(isVertical);
        return new int[1][1];
    }

    String check(int line, int column) {
        return field[line][column];
    }
}
