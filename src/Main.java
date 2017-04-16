import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by mohammedissa on 12/27/16.
 */
public class Main {

    public static void main(String[] args0) throws FileNotFoundException {


        File file = new File("Processes.txt");
        Scanner scanner = new Scanner(file);

        int[][] matrix1 = new int[5][3];
        int[][] matrix2 = new int[5][3];
        int[][] matrix3 = new int[1][3];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j]=Integer.parseInt(scanner.next());
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j]=Integer.parseInt(scanner.next());
            }
        }

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 3; j++) {
                matrix3[i][j]=Integer.parseInt(scanner.next());
            }
        }




    }


}
