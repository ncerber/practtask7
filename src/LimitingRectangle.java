public class LimitingRectangle {
    private int[][] points;
    private int[][] rectangle;

    private void calcRectangle(){
        int minX = points[0][0];
        int minY = points[0][1];
        int maxX = points[0][0];
        int maxY = points[0][1];

        for (int i = 0; i < points.length; i++) {
            if (points[i][0]<minX) {
                minX = points[i][0];
            } else if (points[i][0]>maxX){
                maxX = points[i][0];
            }
        }
    }

    public LimitingRectangle(int[][] points){
        this.points = new int[points.length][points[0].length];
        for (int i = 0; i < points.length ; i++) {
            for (int j = 0; j <points[i].length ; j++) {
                this.points[i][j] = points[i][j];
            }
        }
        calcRectangle();
    }
}
