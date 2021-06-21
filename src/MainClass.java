import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
//        LimitingRectangle limitingRectangle;
//        limitingRectangle = new LimitingRectangle(new int[][]{{1,2},{5,6},{-1,2}});
//        System.out.println(Arrays.toString());

//        ToTable toTable = new ToTable(new int[] {1, 2, 3, 4, 5, 6, 7,8,9,10}, 3, 3);
//        int[][] res = toTable.resize();
//        System.out.print("[");
//        for (int i = 0; i < res.length; i++) {
//            System.out.print(Arrays.toString(res[i])+",");
//        }
//        System.out.print("]");

//        ToLine a = new ToLine(new int[][] {{1, 2}, {3, 4}, {5, 6}});
//        int[] arr = a.resize();
//        System.out.println(Arrays.toString(arr));

//        Mage a1 = new Mage("a", 10, 10,"earth");
//        Mage b1 = new Mage("b", 12, 10,"earth");
//        a1.fight(b1);


//        New game
//        makeMove(1, 1)
//        makeMove(1, 1)
//        makeMove(1, 2)
//        makeMove(2, 2)
//        makeMove(3, 1)
//        makeMove(3, 3)
//        makeMove(2, 1)
//        E.
//                New game
//        makeMove(1, 1)
//        makeMove(3, 3)
//        makeMove(1, 2)
//        makeMove(3, 2)
//        makeMove(2, 2)
//        makeMove(3, 1)
//                .
//                New game
//        makeMove(2, 2)
//        makeMove(3, 1)
//        makeMove(3, 2)
//        makeMove(2, 1)
//        makeMove(1, 2)
//                .
//                New game
//        makeMove(1, 1)
//        makeMove(2, 2)
//        makeMove(1, 2)
//        makeMove(1, 3)
//        makeMove(2, 1)
//        makeMove(3, 1)
//                .
//                New game
//        makeMove(2, 2)
//        makeMove(1, 1)
//        makeMove(3, 1)
//        makeMove(1, 3)
//        makeMove(1, 2)
//        makeMove(3, 2)
//        makeMove(2, 1)
//        makeMove(2, 3)
//        makeMove(3, 3)
//        makeMove(1, 1)

//        makeMove(1, 1)
//        makeMove(1, 1)
//        Cell 1, 1 is already occupied
//        makeMove(1, 2)
//        makeMove(2, 2)
//        makeMove(3, 1)
//        makeMove(3, 3)
//        makeMove(2, 1)

        TicTacToe board = new TicTacToe();
        System.out.println(board.makeMove(1, 1));
        System.out.println(board.makeMove(1, 1));
        System.out.println(board.makeMove(1, 2));
        System.out.println(board.makeMove(2, 2));
        System.out.println(board.makeMove(3, 1));
        System.out.println(board.makeMove(3, 3));
        System.out.println(board.makeMove(2, 1));
        String[][] field = board.getField();
        for (int i = 0; i < field.length; i++) {
            System.out.println(Arrays.toString(field[i]));
        }

        //makeMove(1, 1)
        ////        makeMove(3, 3)
        ////        makeMove(1, 2)
        ////        makeMove(3, 2)
        ////        makeMove(2, 2)
        ////        makeMove(3, 1)
//        board.newGame();
//        System.out.println(board.makeMove(1, 1));
//        System.out.println(board.makeMove(3, 3));
//        System.out.println(board.makeMove(1, 2));
//        System.out.println(board.makeMove(3, 2));
//        System.out.println(board.makeMove(2, 2));
//        System.out.println(board.makeMove(3, 1));
//        System.out.println(board.makeMove(2, 1));
//        field = board.getField();
//        for (int i = 0; i < field.length; i++) {
//            System.out.println(Arrays.toString(field[i]));
//        }

        //        makeMove(2, 2)
//        makeMove(3, 1)
//        makeMove(3, 2)
//        makeMove(2, 1)
//        makeMove(1, 2)
//        board.newGame();
//        System.out.println(board.makeMove(2, 2));
//        System.out.println(board.makeMove(3, 1));
//        System.out.println(board.makeMove(3, 2));
//        System.out.println(board.makeMove(2, 1));
//        System.out.println(board.makeMove(1, 2));
//        field = board.getField();
//        for (int i = 0; i < field.length; i++) {
//            System.out.println(Arrays.toString(field[i]));
//        }

        //        makeMove(1, 1)
//        makeMove(2, 2)
//        makeMove(1, 2)
//        makeMove(1, 3)
//        makeMove(2, 1)
//        makeMove(3, 1)
//        board.newGame();
//        System.out.println(board.makeMove(1, 1));
//        System.out.println(board.makeMove(2, 2));
//        System.out.println(board.makeMove(1, 2));
//        System.out.println(board.makeMove(1, 3));
//        System.out.println(board.makeMove(2, 1));
//        System.out.println(board.makeMove(3, 1));
//        field = board.getField();
//        for (int i = 0; i < field.length; i++) {
//            System.out.println(Arrays.toString(field[i]));
//        }
//        makeMove(2, 2)
//        makeMove(1, 1)
//        makeMove(3, 1)
//        makeMove(1, 3)
//        makeMove(1, 2)
//        makeMove(3, 2)
//        makeMove(2, 1)
//        makeMove(2, 3)
//        makeMove(3, 3)
//        makeMove(1, 1)
//        board.newGame();
//        System.out.println(board.makeMove(2, 2));
//        System.out.println(board.makeMove(1, 1));
//        System.out.println(board.makeMove(3, 1));
//        System.out.println(board.makeMove(1, 3));
//        System.out.println(board.makeMove(1 ,2));
//        System.out.println(board.makeMove(3, 2));
//        System.out.println(board.makeMove(2, 1));
//        System.out.println(board.makeMove(2, 3));
//        System.out.println(board.makeMove(3, 3));
//        System.out.println(board.makeMove(1, 1));
//        field = board.getField();
//        for (int i = 0; i < field.length; i++) {
//            System.out.println(Arrays.toString(field[i]));
//        }
    }
}
