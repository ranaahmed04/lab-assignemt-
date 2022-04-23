package com.company;

public class YoungPhysicist {
    public Boolean Calc_Coordinates(int n, int[][] array) {


        int x_coordinate = 0, y_coordinate = 0, z_coordinate = 0;
        if (n >= 1 && n <= 100) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 3; j++) {
                    if (array[i][j] >= -100 && array[i][j] <= 100) {


                        x_coordinate += array[i][0];
                        y_coordinate += array[i][1];
                        z_coordinate += array[i][2];

                    }
                    else {
                        System.out.println("not accepted as coodinates must be between -100 & 100");

                        return false;
                    }
                }

            }

            if (x_coordinate == 0 && y_coordinate == 0 && z_coordinate == 0) {

                System.out.println("Yes");
                return true;
            }
            else {
                System.out.println("No");
                return false;
            }
        } else {
            System.out.println("1<=n<=100");
            return false;

        }


    }
}
