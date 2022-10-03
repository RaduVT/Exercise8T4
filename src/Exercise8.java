public class Exercise8 {
    public static void main(String[] args) {
        int[][] array = new int[10][10];// Declaration and instantiation
        // Initialization
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[0].length; col++) {
                array[row][col] = 0;
            }
        }
        array[0][4] = 1;
        array[2][6] = 1;
        array[3][1] = 1;
        array[8][6] = 1;

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[0].length; col++) {
                System.out.print(array[row][col] + "  ");
            }
            System.out.println();
        }
    }
}