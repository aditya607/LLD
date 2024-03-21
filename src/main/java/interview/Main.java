package interview;

public class Main {

    public static class Pair {
        int row;
        int col;
        public Pair(int row,int  col) {
            this.row = row;
            this.col = col;
        }

        public int getRow() {
            return row;
        }

        public void setRow(int row) {
            this.row = row;
        }

        public int getCol() {
            return col;
        }

        public void setCol(int col) {
            this.col = col;
        }
    }

    public static void main(String[] args) {
        int rowLength = 4;
        int colLength = 4;
        int[][] matrix = new int[rowLength][colLength];
        matrix[0] = new int[]{0, 1, 1, 0};
        matrix[1] = new int[]{1, 1, 1, 1};
        matrix[2] = new int[]{1, 1, 1, 1};
        matrix[3] = new int[]{1, 1, 0, 0};


        Pair[][] maxRectangle = new Pair[rowLength][colLength];

        if(matrix[0][0] == 1) {
            maxRectangle[0][0] = new Pair(1,1);
        } else {
            maxRectangle[0][0] = new Pair(0,0);
        }
        for(int i=1; i< colLength; i++) {
            if(matrix[0][i-1] == 1) {
                maxRectangle[0][i] = new Pair(1,maxRectangle[0][i-1].getCol()+1);
            } else {
                maxRectangle[0][i] = new Pair(0,0);
            }
        }

        for(int i=1; i< rowLength; i++) {
            if(matrix[i-1][0] == 1) {
                maxRectangle[i][0] = new Pair(maxRectangle[i-1][0].getRow()+1, 1);
            } else {
                maxRectangle[0][i] = new Pair(0,0);
            }
        }
        for(int i=1; i<rowLength; i++) {
            for(int j=1; j<colLength; j++) {
                maxRectangle[i][j] = calculateMaximum(maxRectangle[i-1][j], maxRectangle[i][j-1]);
            }
        }
        int sum = 0;
        for(int i=0; i<rowLength; i++) {
            for(int j=0; j<colLength; j++) {
                sum = Math.max(sum, maxRectangle[i][j].getRow()* maxRectangle[i][j].getCol());
            }
        }
    }
    public static Pair calculateMaximum(Pair pair1, Pair pair2){
        if( pair1.getCol() * pair1.getRow() > pair2.getCol() * pair2.getRow()) {
            return pair1;
        } else {
            return pair2;
        }
    }
}
