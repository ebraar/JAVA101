public class ForEachKullanimi {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        for(int[] u : matrix){
            for(int elem : u){
                System.out.println(elem);
            }
        }
    }
}
