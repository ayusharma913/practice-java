import java.util.*;

//trapping rainwater question 

//time complexity ....this code is run by number if height times i.e. O(n )

// public class trickyques {
//     public static int trappedRainwater(int height[]){

//         //to calculate left max boundary

//         int leftMax[] = new int[height.length];
//         leftMax[0] = height[0];

//         for(int i = 1; i<height.length; i++){
//             leftMax[i] = Math.max(height[i] , leftMax[i-1]);
//          }

//          //to calculate rightMax boundary

//          int rightMax[] = new int[height.length];
//          rightMax[height.length-1] = height[height.length-1];
//          for(int i = height.length-2; i>=0;i--){
//             rightMax[i] = Math.max(height[i], rightMax[i+1]); 
//          }

//          int trappedWater = 0;

//          //loop

//          for(int i =0; i<height.length; i++){
            
//             //waterlevel = min(leftmax bound, rightmax bound)

//             int waterLevel = Math.min(leftMax[i], rightMax[i]);

//             //trapped water = waterlevel - height[i]

//             trappedWater += waterLevel - height[i];
//          }
//          return trappedWater;
//     }
//     public static void main(String[] args) {
//         int height[] = {4,2,0,6,3,2,5};
//         System.out.println(trappedRainwater(height));
//     }
// }


// best time to buy and sell stocks


// public class trickyques {

//     public static int stocks(int prices[]){
//         int buyPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;

//         for(int i = 0; i<prices.length; i++){
//             if(buyPrice<prices[i]){
//                 int profit = prices[i] - buyPrice; //todays profit
//                 maxProfit = Math.max(maxProfit, profit); // global profit
                
//             }
//             else{
//                 buyPrice = prices[i]; //this is the case when bp > sp so we simple replace the bp with new bp that will be the sp

//             }
            
//         }
//         return maxProfit;
//     }
//     public static void main(String[] args) {
//         int  prices[] = {7,1,5,3,6,4};
//         System.out.println(stocks(prices));
//     }    
// }




// spiral matrix question ...2D array

// public class trickyques {
//     public static void printSpiral(int matrix[][]){
//         int startRow = 0;
//         int startCol = 0;
//         int endRow = matrix.length -1;
//         int endCol = matrix[0].length- 1;

//         while (startRow <= endRow && startCol <= endCol) {
//             //top part of matrix
//             for(int j = startCol; j<= endCol; j++){
//                 System.out.print(matrix[startRow][j]+" ");
//             }

//             //right part of matrix
//             for(int i = startRow + 1; i<= endRow; i++){
//                 System.out.print(matrix[i][endCol] + " ");
//             }

//             //bottom part of matrix

//             for(int j = endCol-1; j>=startCol; j--){
//                 if(startRow == endRow){
//                     break;
//                 }
//                 System.out.print(matrix[endRow][j] + " ");
//             }

//             //this is when n*n or n*m is even in no. for odd we write as above
//             // for(int j = endCol - 1; j >= startCol; j--){
//             //     System.out.print(matrix[endRow][j] + " ");
//            // }

//             //left part of matrix

//             //for oddd we have
//             for(int i =endRow -1; i>= startRow +1; i--){
//                 if(startCol == endCol){
//                     break;
//                 }
//                 System.out.print(matrix[i][startCol] + " ");
//             }

//             // this is part is for when we have even n*n or n*m
//             // for(int i = endRow - 1; i >= startRow + 1; i--){
//             //     System.out.print(matrix[i][startCol] + " ");
//             //}

//             startRow++;
//             startCol++;
//             endRow--;
//             endCol--;
//         }

//         System.out.println();
//     }

//     public static int diagonalSum(int matrix[][]){
//         int sum = 0;

//         // this is not optimised code thus it is brute force approach 
//         // for(int i =0; i<matrix.length; i++){
//         //     for(int j =0; j<matrix[0].length; j++){
//         //         if(i==j){
//         //             sum += matrix[i][j];
//         //         }
//         //         else if(i+j == matrix.length -1){
//         //             sum += matrix[i][j];
//         //         }
//         //     }
//         // }

//         // now for linear time complexity 

//         for(int i=0; i <matrix.length; i++){
//             //for primary daigonal
//             sum += matrix[i][i];
//             //for secondary diagonal
//             if(i != matrix.length - 1-i){
//                 sum += matrix[i][matrix.length - 1 - i];
//             }
//         }
//         return  sum;
//     }
// public static void main(String[] args) {
//     int matrix [][] = {{1,2,3,4} ,
//                        {5,6,7,8}, 
//                        {9,10,11,12}, 
//                        {13,14,15,16}};

//     printSpiral(matrix); 
//     System.out.println(diagonalSum(matrix));               
//     }    
// }



// search in a 2D array matrix


public class trickyques {

    public static boolean staircaseSearch(int matrix[][], int key){
        int row = 0, col = matrix[0].length-1;

        while(row<matrix.length && col >=0){
            if(matrix[row][col] == key){
                System.out.println("found key at (" +row +" , " +col +")");
                return true;
            }

            else if(key < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found!");
        return false;
    }
    public static void main(String[] args) {
        int matrix [][] = {{10,20,30,40},
                           {15,25,35,45},
                           {27,29,37,48},
                           {32,33,39,50}};

        int key = 33;
        staircaseSearch(matrix, key);
    }    
}