
public class inv_rot_HalfPyramid {
    public static void Rotated_HalfPyramid(int n) {
        // outer loop for rows
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // move to next line
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Rotated_HalfPyramid(4);
    }
}
