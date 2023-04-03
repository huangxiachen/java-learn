public class Java_1 {

    public static void main(String[] args) {
        int i, j, a, b;
        int[][] m = {{1, 2, 3}, {1, 2, 3, 4}, {1, 2, 4, 300, 5}, {3, 5, 6, 8, 10, 9}};

        a = 0;
       //**********Found**********
        b = 0;
       //**********Found**********
        for (i = 0; i < m.length; i++) {
            //**********Found**********
            for (j = 0; j < m[i].length; j++) {
                //**********Found**********
                if ( m[a][b] < m[i][j]) {
                    a = i;
                    b = j;
                }
            }
        }
        //**********Found**********
        System.out.println("max=" + m[a][b] + ",row=" + a + ",col=" + b);
    }
}