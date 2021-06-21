public class ToTable {
    private int[] data;
    private int x,y;

    public ToTable(int[] data, int x, int y) {
        this.data = data;
        this.x = x;
        this.y = y;
    }

    public int[][] resize(){
        int[][] resMass = new int[x][y];
        int iter = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                resMass[i][j] = data[iter];
                System.out.println("i = "+i+"; j="+j+"; iter="+iter+"; data[iter]="+data[iter]);
                iter++;
                if(iter>=data.length) {
                    break;
                }
            }
        }
        return resMass;
    }
}
