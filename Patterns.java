package com.company;

public class Patterns {
    public static void print_HollowRectangle(int rows, int cols){
        //outer loop to track Rows
        for (int i=1; i<=rows; i++){
            // inner loop to track Cols
            for (int j=1; j<=cols; j++){
                //condition to print stars
                if (i==1 || j==1 || i==rows || j==cols){
                    System.out.print("*");
                }
                //condition to print space
                else System.out.print(" ");
            }
            System.out.println(); // to print next line
        }
    }
    public static void print_RotatedHalfPyramid(int rows ){
        //Outer loop to track Rows
        for (int i=1; i<=rows; i++){
            // Inner loop 1 to Print Spaces
            for (int j=1; j<=rows-i; j++){
                    System.out.print(" ");
            }
            //Inner loop 2 to Print Stars
            for (int k=0; k<i ; k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void half_NumberPyramid(int n){
        //outer loop to check rows
        for (int i=0; i<n; i++){
            //inner loop to print Numbers
            for (int j=1; j<=n-i; j++){
                System.out.print(j); // j acts as a Number, j gets reset every time
            }
            //to print next line
            System.out.println();
        }
    }
    public static void FloydTriangle(int n){
        int k=0;//initialised variable that gets updated
        //Outer Loop To track Lines
        for (int i=1; i<=n; i++){
            //Inner Loop to Print Numbers
            for (int j=0; j<i; j++){
                k++;  //Number gets updated ; depends on the inner loop, for how much?
                System.out.print(k +" ");
            }
            System.out.println();
        }
    }
    public static void ButterflyPattern(int n){
        //Outer Loop to track Lines
        for (int i=0; i<=n; i++) {
            //Inner Loop to print stars
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            //Inner Loop to Print spaces
            for (int j=2*(n-i); j>0; j--){//j==2*(n-1)
                System.out.print(" ");
            }
            //Inner Loop to print Stars
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i=n; i>=0; i--){
            for (int j=i; j>=0; j--){
                System.out.print("*");
            }
            for (int j=0; j<2*(n-i); j++){
                System.out.print(" ");
            }
            for (int j=i; j>=0; j--){
                System.out.print("*");
            }
            System.out.println();

        }

    }
    public static void SolidRhombus(int n){
        //Outer Loop to track Lines
        for (int i=0; i<n; i++){
            //inner Loop to print spaces
            for (int j=0; j<(n-i); j++){
                System.out.print(" ");
            }
            //Inner Loop to print stars
            for (int j=0; j<n; j++ ){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void HollowRhombus(int n) {
        //Outer Loop to track Lines
        for (int i=0; i<n; i++){
            //Inner Loop to Print Spaces
            for (int j=0; j<(n-i); j++){
                System.out.print(" ");
            }
            //Inner Loop to Print Stars
            for (int j=0; j<n; j++){
                //Condition to print Stars
                if (i==0 || i==(n-1) || j==(n-1) || j==0){
                    System.out.print("*");
                }else System.out.print(" ");

            }
            System.out.println();
        }

    }
    public static void Diamond(int n){
        //Outer Loop to Track Lines
        for (int i=1; i<=n; i++){
            //Inner Loop to print Spaces
            for (int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //Inner Loop to print Stars
            for (int j=1; j<=(2*i)-1; j++){ //(2*i)-1 is Logic that was Learned while Observing
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i=n; i>=1; i--){
            for (int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for (int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void NumberPyramid(int n){
        //Outer Loop to Track Lines
        for (int i=1; i<=n; i++){
            //Inner Loop to Print Spaces
            for (int j=0; j<=(n-i); j++){
                System.out.print(" ");
            }
            //Inner Loop to print Numbers
            for (int j=1; j<=(i); j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void PalindromicNum(int n){
        //Outer Loop to Track Lines
        for (int i=1; i<=n; i++){
            //Inner Loop to Print Spaces
            for (int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //Inner Loop to Print First Half of Numbers
            for (int j=i; j>=1; j--){
                System.out.print(j);

            }
            //Inner Loop to print Second Half of Numbers
            for (int j=2; j<=i; j++ ){ //starts with 2 because 1 should not be printed twice
                System.out.print(j);
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        // print_HollowRectangle(10,25);
        // print_RotatedHalfPyramid(5);
        // half_NumberPyramid(5);
        // FloydTriangle(5);
        // ButterflyPattern(4);
        // SolidRhombus(5);
        // HollowRhombus(7);
        // Diamond(5);
        // NumberPyramid(5);
        // PalindromicNum(5);


    }

   }
