package week07_10_22_20222;
/*
 *******
 *******
 *******
 *******
 */
public class NestedLoopIntro {

    public static void main(String[] args) {

        int starNumberColumn=7;
        int starNumberRow=4;

        for (int i = 1; i <=starNumberRow ; i++) { //row number
            // System.out.println();
            for (int j = 1; j <=starNumberColumn ; j++) { //column number
                System.out.print("*"); // 7 times *
            }
            System.out.println();

        }

    }
}
