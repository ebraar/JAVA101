public class RandomCokBoyutluDizi {
    public static void main(String[] args) {
        int[][] matrix = new int[3][4];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 100);
                System.out.print(matrix[row][column]+" ");
            }
            System.out.println();
        }
    }
}
