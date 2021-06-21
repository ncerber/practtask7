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

        Mage a1 = new Mage("a", 10, 10,"earth");
        Mage b1 = new Mage("b", 12, 10,"earth");
        a1.fight(b1);
    }
}
