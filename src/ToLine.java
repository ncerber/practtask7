public class ToLine {
    private int[][] data;

    public ToLine(int[][] data) {
        this.data = data;
    }

    public int[] resize() {
        int count = data.length * data[0].length;
        int iter = 0;
        int[] resMass = new int[count];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                resMass[iter++] = data[i][j];
            }
        }
        return resMass;
    }
}
