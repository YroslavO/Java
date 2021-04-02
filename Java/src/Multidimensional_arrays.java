public class Multidimensional_arrays {
    public static void main(String[] args){
        int [] i = {1,2,3,4};
        System.out.println(i[1]);
        int [][] matrix = {{1,2,3},
                           {4,5,6},
                           {7,8,9}};
        System.out.println(matrix[1][0]);
        String[][] x = new String[2][3];
        x[1][1]="qqq";
        System.out.println(x[1][1]);

        for(int j = 0;j<matrix[j].length;j++){
            for(int t = 0;t<matrix[j].length;t++){
                System.out.print(matrix[j][t] + " ");
            }
            System.out.println();
        }

    }
}
