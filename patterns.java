//import java.util.Scanner;
/* public class patterns {
    // this pattern is to get star pattern in dec order
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        for(int line =1; line <= 4; line++ ){
            for(int star = 1; star<=line; star++){
                System.out.print("*");              
            }
            System.out.println();
        }
        } 

        //this pattern to get in increasing order or reverse order

        public static void main(String[] args) {
            for(int line = 1; line <= 4; line++){
                for(int star = 1; star<= 4-line+1; star++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    } */

    //to print character pattern
/**
 * patterns
 */
// public class patterns {
//     public static void main(String[] args) {
//         char ch = 'A';
//         for(int line = 1; line <=4; line ++){
//             for(int j = 1; j<=line; j++){
//                 System.out.print(ch);
//                 ch++;
//             }
//             System.out.println(); //this println is to move to next line
//         }
//     }
// }

//to print hollow rectangle

import java.util.Scanner;
public class patterns {
    public static void holRec(int totRow,int totCol) {
        // outer loop
        for(int i = 1;i<=totRow;i++){
            for(int j =1; j<=totCol;j++){
                if(i ==1 || i==totRow || j ==1 || j==totCol){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter length of rectangle:");
        int a = sc.nextInt();
        System.out.print("enter breadth of rectangle:");
        int b = sc.nextInt();
        holRec(b, a);
        sc.close();
    }
}