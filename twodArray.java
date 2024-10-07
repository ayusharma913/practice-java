import java.util.*;
public class twodArray {

    public static boolean search(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j =0; j< matrix[0].length; j++){
                if(matrix[i][j] ==key ){
                    System.out.println("found at cell " +i + ","  +j);
                    return true;
                }
            }
        }
        System.out.println("not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix [][] = new int [3][3];
        //it has 3*3 = 9 cells in total
        int n=3, m=3;
         // this represents no. of rows n columns
        // we can also write this as 
        // n = matrix.length , m= matrix[0].length

        Scanner sc = new Scanner(System.in);
        // basic standar to fill data in 2d array is to fill from smalles row n col n then goes on

        
        // this is for input
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print("enter the data:");
                matrix[i][j] = sc.nextInt();
            }
        }

        // this is for output
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

        search(matrix, 5);
    }
}
