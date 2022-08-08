import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int[][] arr = new int[2][2];
        Scanner scanner = new Scanner(System.in);
        for (int a = 0; a < 2; a++) {
            for (int b = 0; b < 2; b++) {
                System.out.println("Nhap phan tu thu [" + a + "," + b + "] :" );
                arr[a][b] = scanner.nextInt();
            }
        }
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Min = " + min);
    }
}
