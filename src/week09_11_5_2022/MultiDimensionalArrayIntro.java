package week09_11_5_2022;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {

        int[] firstArray = {1, 2, 3}; // elemanı bilmiyorsak new keyboard [] kulanıyoruz
        int[] secondArray = {4, 5, 6};
        int[] thirdArray = {7, 8, 9};

        int[][] twoDimenArray = {
                //   0 1  2
                {1, 2, 3},   //first array // 0 ==> index of array
                {4, 5, 6},  //second array // 1
                {7, 8, 9, 10} //third array // 2
                // 0 1 2 3
        };

        int[][] array2D = {firstArray, secondArray, thirdArray}; // we can use like this
        //= {{}, {},{}};

        System.out.println(twoDimenArray[0][1]); //in order to reach 2 first we need to go to first array by using
        // index of array which is 0 then I need to go to that element by using index of element which is 1
        System.out.println(twoDimenArray[2][2]);  //3 row number // 9 u bulmak için

        for (int i = 0; i < twoDimenArray.length; i++) { // in order to go to array one by one
            System.out.println(i + 1 + ". array "); //column number

            for (int j = 0; j < twoDimenArray[i].length; j++) { // this is for finding element inside inner array
                System.out.println(twoDimenArray[i][j]);

            }
            System.out.println("=============");

            int[][][] array3D = {
                    {
                            {1, 2, 3},  //this is for first 2 dimensional array
                            {4, 5, 6}

                    },
                    {
                            {1, 2, 3}, // this is for second 2 dimensional array
                            {4, 5, 6}

                    }

            };

        }
    }
}