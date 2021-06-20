public class LimitingRectangle {
    private int[][] points;
    private int[][] rectangle;

    public int[][] getRectangle() {
        return rectangle;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append(rectangle[0][0]);
        stringBuilder.append(",");
        stringBuilder.append(rectangle[0][1]);
        stringBuilder.append("], ");

        stringBuilder.append("[");
        stringBuilder.append(rectangle[1][0]);
        stringBuilder.append(",");
        stringBuilder.append(rectangle[1][1]);
        stringBuilder.append("], ");

        return stringBuilder.toString();
    }

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

        for (int i = 0; i < points.length; i++) {
            if (points[i][1]<minY) {
                minY = points[i][1];
            } else if (points[i][1]>maxY){
                maxY = points[i][1];
            }
        }
        rectangle = new int[2][2];
        rectangle[0][0] = minX;
        rectangle[0][1] = maxY;
        rectangle[1][0] = maxX;
        rectangle[1][1] = minY;
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

    public int getWidth(){
        return rectangle[1][0]-rectangle[0][0];
    }

    public int getHeight(){
        return rectangle[0][1]-rectangle[1][1];
    }

    public String getBorders(){
        return rectangle[1][1]+","+rectangle[0][1]+","+rectangle[0][0]+","+rectangle[1][0];
    }
}
